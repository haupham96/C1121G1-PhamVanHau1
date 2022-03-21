package repository.impl;

import data_transfer_object.KhachHangDTO;
import model.KhachHang;
import model.LoaiKhach;
import repository.ConnectionDataBase;
import repository.IKhachHangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhachHangRepository implements IKhachHangRepository {
    ConnectionDataBase connectionDataBase = new ConnectionDataBase();
    private static final String SELECT_ALL_CUSTOMERS = "SELECT * FROM khach_hang;";
    private static final String SELECT_ALL_CUSTOMERS_WITH_CUSTOMER_CLASS = "select khach_hang.ma_khach_hang , loai_khach.ten_loai_khach , khach_hang.ho_ten , khach_hang.ngay_sinh ,khach_hang.gioi_tinh , khach_hang.so_cmnd , khach_hang.so_dien_thoai , khach_hang.email , khach_hang.dia_chi\n" +
            "            from khach_hang  join loai_khach\n" +
            "            on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach\n" +
            "            group by khach_hang.ma_khach_hang \n" +
            "            order by khach_hang.ma_khach_hang;";
    private static final String SELECT_ALL_LOAI_KHACH = "SELECT * FROM loai_khach;";
    private static final String INSERT_CUSTOMER = "insert into khach_hang (ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi)\n" +
            "values(?,?,?,?,?,?,?,?);";
    private static final String FIND_CUSTOMER_BY_ID = "SELECT * FROM khach_hang where ma_khach_hang = ? ;";
    private static final String EDIT_CUSTOMER_BY_ID = "update khach_hang " +
            "set ma_loai_khach = ? , ho_ten = ? , ngay_sinh = ? , gioi_tinh = ? , so_cmnd = ? , so_dien_thoai = ? , email = ? , dia_chi = ? " +
            "where ma_khach_hang = ? ; ";

    private static final String DELETE_CUSTOMER_BY_ID = "set foreign_key_checks = 0 ; delete from khach_hang\n" +
            "where khach_hang.ma_khach_hang = ? ; set foreign_key_checks = 1 ; ";

    @Override
    public List<KhachHang> getAllCustomer() {
        List<KhachHang> khachHangList = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKhachHang(rs.getInt(1));
                khachHang.setLoaiKhach(rs.getInt(2));
                khachHang.setHoTen(rs.getString(3));
                khachHang.setNgaySinh(rs.getString(4));
                khachHang.setGioiTinh(rs.getInt(5));
                khachHang.setSoCMND(rs.getString(6));
                khachHang.setSoDienThoai(rs.getString(7));
                khachHang.setEmail(rs.getString(8));
                khachHang.setDiaChi(rs.getString(9));
                khachHangList.add(khachHang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return khachHangList;
    }

    @Override
    public List<LoaiKhach> getAllLoaiKhach() {
        List<LoaiKhach> loaiKhachList = new ArrayList<>();
        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_LOAI_KHACH);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                LoaiKhach loaiKhach = new LoaiKhach();
                loaiKhach.setMaLoaiKhach(rs.getInt(1));
                loaiKhach.setTenLoaiKhach(rs.getString(2));
                loaiKhachList.add(loaiKhach);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return loaiKhachList;
    }

    @Override
    public List<KhachHangDTO> getAllCustomerWithCustomerClass() {
        List<KhachHangDTO> khachHangDTOList = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS_WITH_CUSTOMER_CLASS);
        ) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                KhachHangDTO khachHangDTO = new KhachHangDTO();
                khachHangDTO.setMaKhachHang(rs.getInt(1));
                khachHangDTO.setLoaiKhach(rs.getString(2));
                khachHangDTO.setHoTen(rs.getString(3));
                khachHangDTO.setNgaySinh(rs.getString(4));
                khachHangDTO.setGioiTinh(rs.getInt(5));
                khachHangDTO.setSoCMND(rs.getString(6));
                khachHangDTO.setSoDienThoai(rs.getString(7));
                khachHangDTO.setEmail(rs.getString(8));
                khachHangDTO.setDiaChi(rs.getString(9));
                khachHangDTOList.add(khachHangDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return khachHangDTOList;
    }

    @Override
    public void addNewCustomer(KhachHang khachHang) {

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);) {
            preparedStatement.setInt(1, khachHang.getLoaiKhach());
            preparedStatement.setString(2, khachHang.getHoTen());
            preparedStatement.setString(3, khachHang.getNgaySinh());
            preparedStatement.setInt(4, khachHang.getGioiTinh());
            preparedStatement.setString(5, khachHang.getSoCMND());
            preparedStatement.setString(6, khachHang.getSoDienThoai());
            preparedStatement.setString(7, khachHang.getEmail());
            preparedStatement.setString(8, khachHang.getDiaChi());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public KhachHang findCustomerById(Integer id) {
        KhachHang khachHang = new KhachHang();
        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_CUSTOMER_BY_ID);) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                khachHang.setMaKhachHang(rs.getInt(1));
                khachHang.setLoaiKhach(rs.getInt(2));
                khachHang.setHoTen(rs.getString(3));
                khachHang.setNgaySinh(rs.getString(4));
                khachHang.setGioiTinh(rs.getInt(5));
                khachHang.setSoCMND(rs.getString(6));
                khachHang.setSoDienThoai(rs.getString(7));
                khachHang.setEmail(rs.getString(8));
                khachHang.setDiaChi(rs.getString(9));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return khachHang;
    }

    @Override
    public void editCustomer(KhachHang khachHang) {

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(EDIT_CUSTOMER_BY_ID);) {
            preparedStatement.setInt(1, khachHang.getLoaiKhach());
            preparedStatement.setString(2, khachHang.getHoTen());
            preparedStatement.setString(3, khachHang.getNgaySinh());
            preparedStatement.setInt(4, khachHang.getGioiTinh());
            preparedStatement.setString(5, khachHang.getSoCMND());
            preparedStatement.setString(6, khachHang.getSoDienThoai());
            preparedStatement.setString(7, khachHang.getEmail());
            preparedStatement.setString(8, khachHang.getDiaChi());
            preparedStatement.setInt(9, khachHang.getMaKhachHang());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCustomerById(Integer id) {

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_BY_ID);) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<KhachHangDTO> searchByName(String searchName) {
        List<KhachHangDTO> khachHangDTOList = getAllCustomerWithCustomerClass();
        List<KhachHangDTO> listSearch = new ArrayList<>();
        for(KhachHangDTO ls:khachHangDTOList){
            if(ls.getHoTen().contains(searchName)){
                listSearch.add(ls);
            }
        }
        return listSearch;
    }
}
