package repository.impl;

import data_transfer_object.NhanVienDTO;
import model.BoPhan;
import model.NhanVien;
import model.TrinhDo;
import model.ViTri;
import repository.ConnectionDataBase;
import repository.IEmployeeRepository;
import service.Regex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    ConnectionDataBase connectionDataBase = new ConnectionDataBase();
    private static final String SELECT_ALL_EMPLOYEE_DTO = " select nhan_vien.ma_nhan_vien , nhan_vien.ho_ten , nhan_vien.ngay_sinh , nhan_vien.so_cmnd , nhan_vien.luong , nhan_vien.so_dien_thoai , nhan_vien.email , nhan_vien.dia_chi , vi_tri.ten_vi_tri , trinh_do.ten_trinh_do , bo_phan.ten_bo_phan\n" +
            " from nhan_vien join vi_tri on nhan_vien.ma_vi_tri = vi_tri.ma_vi_tri join bo_phan on nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan join trinh_do on nhan_vien.ma_trinh_do=trinh_do.ma_trinh_do\n" +
            " group by nhan_vien.ma_nhan_vien order by nhan_vien.ma_nhan_vien ;";
    private static final String SELECT_ALL_VITRI = "SELECT * FROM furama.vi_tri;";
    private static final String SELECT_ALL_TRINH_DO = "SELECT * FROM furama.trinh_do;";
    private static final String SELECT_ALL_BO_PHAN = "SELECT * FROM furama.bo_phan;";
    private static final String INSERT_INTO_NHAN_VIEN = "insert into nhan_vien(ho_ten , ngay_sinh , so_cmnd , luong , so_dien_thoai , email , dia_chi , ma_vi_tri , ma_trinh_do , ma_bo_phan)\n" +
            "values(?,?,?,?,?,?,?,?,?,?) ;";
    private static final String EDIT_NHAN_VIEN = " update nhan_vien set ho_ten = ? , ngay_sinh = ? , so_cmnd = ? , luong = ? , so_dien_thoai = ? , email = ? , dia_chi = ? , ma_vi_tri = ? , ma_trinh_do = ? , ma_bo_phan = ?\n" +
            "where ma_nhan_vien = ? ;";
    private static final String FIND_NHAN_VIEN_BY_ID = "SELECT * FROM furama.nhan_vien where ma_nhan_vien = ? ;";
    private static final String DELETE_NHAN_VIEN_BY_ID = "delete from nhan_vien where nhan_vien.ma_nhan_vien = ? ; ";

    private static final String A = "";

    @Override
    public List<NhanVienDTO> getAllEmployee() {
        List<NhanVienDTO> list = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE_DTO);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                NhanVienDTO nhanVienDTO = new NhanVienDTO();
                nhanVienDTO.setMaNhanVien(rs.getInt(1));
                nhanVienDTO.setHoTen(rs.getString(2));
                nhanVienDTO.setNgaySinh(rs.getString(3));
                nhanVienDTO.setSoCMND(rs.getString(4));
                nhanVienDTO.setLuong(rs.getString(5));
                nhanVienDTO.setSoDienThoai(rs.getString(6));
                nhanVienDTO.setEmail(rs.getString(7));
                nhanVienDTO.setDiaChi(rs.getString(8));
                nhanVienDTO.setViTri(rs.getString(9));
                nhanVienDTO.setTrinhDo(rs.getString(10));
                nhanVienDTO.setBoPhan(rs.getString(11));
                list.add(nhanVienDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ViTri> getAllPosition() {
        List<ViTri> viTriList = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_VITRI);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ViTri viTri = new ViTri();
                viTri.setMaViTri(rs.getInt(1));
                viTri.setTenViTri(rs.getString(2));
                viTriList.add(viTri);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return viTriList;
    }

    @Override
    public List<TrinhDo> getAllTrinhDo() {
        List<TrinhDo> trinhDoList = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TRINH_DO);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TrinhDo trinhDo = new TrinhDo();
                trinhDo.setMaTrinhDo(rs.getInt(1));
                trinhDo.setTenTrinhDo(rs.getString(2));
                trinhDoList.add(trinhDo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trinhDoList;
    }

    @Override
    public List<BoPhan> getAllBoPhan() {
        List<BoPhan> boPhanList = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BO_PHAN);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                BoPhan boPhan = new BoPhan();
                boPhan.setMaBoPhan(rs.getInt(1));
                boPhan.setTenBoPhan(rs.getString(2));
                boPhanList.add(boPhan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return boPhanList;
    }

    @Override
    public void addNewEmployee(NhanVien nhanVien) {

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_NHAN_VIEN);) {
            preparedStatement.setString(1, nhanVien.getHoTen());
            preparedStatement.setString(2, nhanVien.getNgaySinh());
            preparedStatement.setString(3, nhanVien.getSoCMND());
            preparedStatement.setString(4, nhanVien.getLuong());
            preparedStatement.setString(5, nhanVien.getSoDienThoai());
            preparedStatement.setString(6, nhanVien.getEmail());
            preparedStatement.setString(7, nhanVien.getDiaChi());
            preparedStatement.setInt(8, nhanVien.getViTri());
            preparedStatement.setInt(9, nhanVien.getTrinhDo());
            preparedStatement.setInt(10, nhanVien.getBoPhan());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<NhanVienDTO> searchByName(String searchName) {
        List<NhanVienDTO> list = this.getAllEmployee();
        List<NhanVienDTO> nhanVienDTOList = new ArrayList<>();
        for (NhanVienDTO ls : list) {
            if (ls.getHoTen().contains(searchName)) {
                nhanVienDTOList.add(ls);
            }
        }
        return nhanVienDTOList;
    }

    @Override
    public void editEmployee(NhanVien nhanVien) {
        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(EDIT_NHAN_VIEN);) {
            preparedStatement.setString(1, nhanVien.getHoTen());
            preparedStatement.setString(2, nhanVien.getNgaySinh());
            preparedStatement.setString(3, nhanVien.getSoCMND());
            preparedStatement.setString(4, nhanVien.getLuong());
            preparedStatement.setString(5, nhanVien.getSoDienThoai());
            preparedStatement.setString(6, nhanVien.getEmail());
            preparedStatement.setString(7, nhanVien.getDiaChi());
            preparedStatement.setInt(8, nhanVien.getViTri());
            preparedStatement.setInt(9, nhanVien.getTrinhDo());
            preparedStatement.setInt(10, nhanVien.getBoPhan());
            preparedStatement.setInt(11, nhanVien.getMaNhanVien());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public NhanVien findEmployeeById(Integer maNhanVien) {
        NhanVien nhanVien = new NhanVien();
        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_NHAN_VIEN_BY_ID);) {
            preparedStatement.setInt(1, maNhanVien);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nhanVien.setMaNhanVien(rs.getInt(1));
                nhanVien.setHoTen(rs.getString(2));
                nhanVien.setNgaySinh(rs.getString(3));
                nhanVien.setSoCMND(rs.getString(4));
                nhanVien.setLuong(rs.getString(5));
                nhanVien.setSoDienThoai(rs.getString(6));
                nhanVien.setEmail(rs.getString(7));
                nhanVien.setDiaChi(rs.getString(8));
                nhanVien.setViTri(rs.getInt(9));
                nhanVien.setTrinhDo(rs.getInt(10));
                nhanVien.setBoPhan(rs.getInt(11));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanVien;
    }

    @Override
    public boolean deleteEmployeeById(Integer id) {
        boolean check = true;
        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_NHAN_VIEN_BY_ID);) {
            preparedStatement.setInt(1, id);
            check = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }
}
