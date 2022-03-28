package repository.impl;

import data_transfer_object.ContractDTO;
import data_transfer_object.ContractDetailDTO;
import model.*;
import repository.ConnectionDataBase;
import repository.IContractRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContractRepository implements IContractRepository {
    private final String SELECT_ALL_CONTRACT_DTO = " select hop_dong.ma_hop_dong , hop_dong.ngay_lam_hop_dong , hop_dong.ngay_ket_thuc , hop_dong.tien_dat_coc , nhan_vien.ho_ten , khach_hang.ho_ten , dich_vu.ten_dich_vu \n" +
            " from nhan_vien join hop_dong on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien join khach_hang on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu ;\n";
    private final String SELECT_MA_TEN_NHAN_VIEN = "SELECT ma_nhan_vien , ho_ten FROM furama.nhan_vien ;";
    private final String SELECT_MA_TEN_KHACH_HANG = "SELECT ma_khach_hang , ho_ten FROM furama.khach_hang;";
    private final String SELECT_MA_TEN_DICH_VU = "SELECT ma_dich_vu , ten_dich_vu , ma_loai_dich_vu FROM furama.dich_vu ;";
    private final String INSERT_INTO_HOP_DONG = "insert into hop_dong(ngay_lam_hop_dong , ngay_ket_thuc , tien_dat_coc , ma_nhan_vien , ma_khach_hang , ma_dich_vu) values (?,?,?,?,?,?) ;";
    private final String SELECT_HOP_DONG_CHI_TIET_DTO = "select hop_dong_chi_tiet.ma_hop_dong_chi_tiet , hop_dong_chi_tiet.ma_hop_dong , dich_vu_di_kem.ten_dich_vu_di_kem , hop_dong_chi_tiet.so_luong\n" +
            "from hop_dong_chi_tiet join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem \n" +
            "order by hop_dong_chi_tiet.ma_hop_dong_chi_tiet ;";
    private final String SELECT_DICH_VU_DI_KEM = "SELECT * FROM furama.dich_vu_di_kem;";
    private final String INSERT_HOP_DONG_CHI_TIET = "insert into hop_dong_chi_tiet(so_luong , ma_hop_dong , ma_dich_vu_di_kem) values(?,?,?) ;";
    private final String SELECT_KHACH_HANG_SU_DUNG_DICH_VU_DI_KEM = "SELECT hop_dong_chi_tiet.ma_hop_dong_chi_tiet , khach_hang.ho_ten , dich_vu_di_kem.ten_dich_vu_di_kem , hop_dong_chi_tiet.so_luong \n" +
            "FROM furama.khach_hang join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang \n" +
            "join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong\n" +
            "join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem\n" +
            "group by hop_dong_chi_tiet.ma_hop_dong_chi_tiet\n" +
            "order by khach_hang.ho_ten ;";
    private final String FIND_HOP_DONG_CHI_TIET = "SELECT * FROM furama.hop_dong_chi_tiet where ma_hop_dong_chi_tiet = ? ;";
    private final String UPDATE_HOP_DONG_CHI_TIET ="update hop_dong_chi_tiet \n" +
            "set ma_dich_vu_di_kem = ? , so_luong = ? where ma_hop_dong_chi_tiet = ? ;";
    private final String DELETE_HOP_DONG_CHI_TIET = "delete from hop_dong_chi_tiet where ma_hop_dong_chi_tiet = ? ;";

    private final String TINH_TONG_TIEN_KHACH_SU_DUNG_DICH_VU = "select khach_hang.ho_ten , dich_vu.ten_dich_vu , dich_vu.chi_phi_thue , hop_dong.tien_dat_coc , sum(dich_vu_di_kem.gia * hop_dong_chi_tiet.so_luong) as tien_dich_vu_di_kem, \n" +
            "(dich_vu.chi_phi_thue - hop_dong.tien_dat_coc + sum(dich_vu_di_kem.gia * hop_dong_chi_tiet.so_luong) ) as total\n" +
            "from khach_hang join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang\n" +
            "join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu\n" +
            "join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong\n" +
            "join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem\n" +
            "group by khach_hang.ma_khach_hang;" ;

    ConnectionDataBase connectionDataBase = new ConnectionDataBase();

    @Override
    public List<ContractDTO> getAllContractDTO() {
        List<ContractDTO> list = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CONTRACT_DTO);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ContractDTO contractDTO = new ContractDTO();
                contractDTO.setMaHopDong(rs.getInt(1));
                contractDTO.setNgayLamHopDong(rs.getString(2));
                contractDTO.setNgayKetThuc(rs.getString(3));
                contractDTO.setTienDatCoc(rs.getString(4));
                contractDTO.setMaNhanVien(rs.getString(5));
                contractDTO.setMaKhachHang(rs.getString(6));
                contractDTO.setMaDichVu(rs.getString(7));
                list.add(contractDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<MaNhanVien> getAllMaNhanVien() {
        List<MaNhanVien> list = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MA_TEN_NHAN_VIEN);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                MaNhanVien maNhanVien = new MaNhanVien();
                maNhanVien.setMaNhanVien(rs.getInt(1));
                maNhanVien.setTenNhanVien(rs.getString(2));
                list.add(maNhanVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<MaKhachHang> getAllMaKhachHang() {
        List<MaKhachHang> list = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MA_TEN_KHACH_HANG);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                MaKhachHang maKhachHang = new MaKhachHang();
                maKhachHang.setMaKhachHang(rs.getInt(1));
                maKhachHang.setTenKhachHang(rs.getString(2));
                list.add(maKhachHang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<MaDichVu> getAllMaDichVu() {
        List<MaDichVu> list = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MA_TEN_DICH_VU);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                MaDichVu maDichVu = new MaDichVu();
                maDichVu.setMaDichVu(rs.getInt(1));
                maDichVu.setTenDichVu(rs.getString(2));
                maDichVu.setLoaiDichVu(rs.getInt(3));
                list.add(maDichVu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void createNewContract(Contract contract) {

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_HOP_DONG);) {
            preparedStatement.setString(1, contract.getNgayLamHopDong());
            preparedStatement.setString(2, contract.getNgayKetThuc());
            preparedStatement.setString(3, contract.getTienDatCoc());
            preparedStatement.setInt(4, contract.getMaNhanVien());
            preparedStatement.setInt(5, contract.getMaKhachHang());
            preparedStatement.setInt(6, contract.getMaDichVu());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ContractDetailDTO> getAllContractDetail() {
        List<ContractDetailDTO> list = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_HOP_DONG_CHI_TIET_DTO);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ContractDetailDTO contractDetailDTO = new ContractDetailDTO();
                contractDetailDTO.setMaHopDongChiTiet(rs.getInt(1));
                contractDetailDTO.setMaHopDong(rs.getString(2));
                contractDetailDTO.setMaDichVuDiKem(rs.getString(3));
                contractDetailDTO.setSoLuong(rs.getString(4));
                list.add(contractDetailDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<DichVuDiKem> getAllDichVuDiKem() {
        List<DichVuDiKem> list = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DICH_VU_DI_KEM);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DichVuDiKem dichVuDiKem = new DichVuDiKem();
                dichVuDiKem.setMaDichVuDiKem(rs.getInt(1));
                dichVuDiKem.setTenDichVuDiKem(rs.getString(2));
                dichVuDiKem.setGia(rs.getString(3));
                dichVuDiKem.setDonVi(rs.getString(4));
                dichVuDiKem.setTrangThai(rs.getString(5));
                list.add(dichVuDiKem);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void createNewContractDetail(ContractDetail contractDetail) {

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_HOP_DONG_CHI_TIET);) {
            preparedStatement.setInt(1, contractDetail.getMaHopDong());
            preparedStatement.setInt(2, contractDetail.getMaDichVuDiKem());
            preparedStatement.setString(3, contractDetail.getSoLuong());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<KhachHangSuDungDichVuDiKem> getAllCustomersUseService() {
        List<KhachHangSuDungDichVuDiKem> list = new ArrayList<>();
        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_KHACH_HANG_SU_DUNG_DICH_VU_DI_KEM);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                KhachHangSuDungDichVuDiKem khachHang = new KhachHangSuDungDichVuDiKem();
                khachHang.setMaHopDongChiTiet(rs.getInt(1));
                khachHang.setHoTen(rs.getString(2));
                khachHang.setDichVuDiKem(rs.getString(3));
                khachHang.setSoLuong(rs.getString(4));
                list.add(khachHang);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public ContractDetail getContractDetail(Integer id) {
        ContractDetail contractDetail = null ;
        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_HOP_DONG_CHI_TIET);) {
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
              contractDetail = new ContractDetail();
              contractDetail.setMaHopDongChiTiet(rs.getInt(1));
              contractDetail.setMaHopDong(rs.getInt(2));
              contractDetail.setMaDichVuDiKem(rs.getInt(3));
              contractDetail.setSoLuong(rs.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contractDetail;
    }

    @Override
    public void updateContractDetail(ContractDetail contractDetailUpdate) {
        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_HOP_DONG_CHI_TIET);) {
            preparedStatement.setInt(1,contractDetailUpdate.getMaDichVuDiKem());
            preparedStatement.setString(2,contractDetailUpdate.getSoLuong());
            preparedStatement.setInt(3,contractDetailUpdate.getMaHopDongChiTiet());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteContractById(Integer id) {
        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_HOP_DONG_CHI_TIET);) {
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<TinhTienKhachHang> thanhToanKhachHang() {
        List<TinhTienKhachHang> list = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(TINH_TONG_TIEN_KHACH_SU_DUNG_DICH_VU);) {
           ResultSet rs = preparedStatement.executeQuery();
           while (rs.next()){
               TinhTienKhachHang tinhTienKhachHang = new TinhTienKhachHang();
               tinhTienKhachHang.setHoTenKhachHang(rs.getString(1));
               tinhTienKhachHang.setTenDichVu(rs.getString(2));
               tinhTienKhachHang.setChiPhiThue(rs.getString(3));
               tinhTienKhachHang.setTienDatCoc(rs.getString(4));
               tinhTienKhachHang.setTienDichVuDiKem(rs.getString(5));
               tinhTienKhachHang.setTongTien(rs.getString(6));
               list.add(tinhTienKhachHang);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
