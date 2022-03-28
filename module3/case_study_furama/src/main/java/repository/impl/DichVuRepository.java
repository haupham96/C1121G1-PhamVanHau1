package repository.impl;

import data_transfer_object.*;
import model.*;
import repository.ConnectionDataBase;
import repository.IDichVuRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DichVuRepository implements IDichVuRepository {
    ConnectionDataBase connectionDataBase = new ConnectionDataBase();
    private static final String SELECT_ALL_DICH_VU_DTO = "SELECT dich_vu.dich_vu_code, dich_vu.ma_dich_vu , dich_vu.ten_dich_vu , dich_vu.dien_tich , dich_vu.chi_phi_thue , dich_vu.so_nguoi_toi_da , kieu_thue.ten_kieu_thue , loai_dich_vu.ten_loai_dich_vu , dich_vu.tieu_chuan_phong , dich_vu.mo_ta_tien_nghi_khac , ifnull(dich_vu.dien_tich_ho_boi,-1) ,ifnull(dich_vu.so_tang,-1)\n" +
            "FROM furama.dich_vu join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu\n" +
            "join kieu_thue on kieu_thue.ma_kieu_thue = dich_vu.ma_kieu_thue\n" +
            "group by dich_vu.ma_dich_vu\n" +
            "order by dich_vu.ma_dich_vu ;";

    private static final String SELECT_ALL_KIEU_THUE = "SELECT * FROM kieu_thue ;";
    private static final String SELECT_ALL_LOAI_DICH_VU = "SELECT * FROM loai_dich_vu ;";
    private static final String INSERT_VILLA = "insert into dich_vu(dich_vu_code,ten_dich_vu , dien_tich , chi_phi_thue , so_nguoi_toi_da , ma_kieu_thue , ma_loai_dich_vu , tieu_chuan_phong , mo_ta_tien_nghi_khac , dien_tich_ho_boi , so_tang  )\n" +
            "values(?,?,?,?,?,?,?,?,?,?,?) ;";
    private static final String INSERT_HOUSE = "insert into dich_vu(dich_vu_code, ten_dich_vu , dien_tich , chi_phi_thue , so_nguoi_toi_da , ma_kieu_thue , ma_loai_dich_vu , tieu_chuan_phong , mo_ta_tien_nghi_khac , so_tang  )\n" +
            "values(?,?,?,?,?,?,?,?,?,?) ;";
    private static final String INSERT_ROOM = "insert into dich_vu(dich_vu_code,ten_dich_vu , dien_tich , chi_phi_thue , so_nguoi_toi_da , ma_kieu_thue , ma_loai_dich_vu , tieu_chuan_phong , mo_ta_tien_nghi_khac )\n" +
            "values(?,?,?,?,?,?,?,?,?) ;";

    @Override
    public List<FullDichVuDTO> getAllDichVu() {
        List<FullDichVuDTO> list = new ArrayList<>();
        String dichVuCode;
        Integer maDichVu;
        String tenDichVu;
        Double dienTich;
        Double chiPhiThue;
        Integer soNguoiToiDa;
        String kieuThue;
        String loaiDichVu;
        String tieuChuanPhong;
        String moTaTienNghiKhac;
        Double dienTichHoBoi;
        Integer soTang;
        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DICH_VU_DTO);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                dichVuCode = rs.getString(1);
                maDichVu = (rs.getInt(2));
                tenDichVu = (rs.getString(3));
                dienTich = (rs.getDouble(4));
                chiPhiThue = (rs.getDouble(5));
                soNguoiToiDa = (rs.getInt(6));
                kieuThue = (rs.getString(7));
                loaiDichVu = (rs.getString(8));
                tieuChuanPhong = (rs.getString(9));
                moTaTienNghiKhac = (rs.getString(10));
                dienTichHoBoi = (rs.getDouble(11));
                soTang = (rs.getInt(12));
                FullDichVuDTO dichVuDTO = new FullDichVuDTO(dichVuCode, maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu, tieuChuanPhong, moTaTienNghiKhac, dienTichHoBoi, soTang);
                list.add(dichVuDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<KieuThue> getAllKieuThue() {
        List<KieuThue> kieuThueList = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_KIEU_THUE);
        ) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                KieuThue kieuThue = new KieuThue();
                kieuThue.setMaKieuThue(rs.getInt(1));
                kieuThue.setTenKieuThue(rs.getString(2));
                kieuThueList.add(kieuThue);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kieuThueList;
    }

    @Override
    public List<LoaiDichVu> getAllLoaiDichVu() {
        List<LoaiDichVu> loaiDichVuList = new ArrayList<>();

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_LOAI_DICH_VU);
        ) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                LoaiDichVu loaiDichVu = new LoaiDichVu();
                loaiDichVu.setMaLoaiDichVu(rs.getInt(1));
                loaiDichVu.setTenLoaiDichVu(rs.getString(2));
                loaiDichVuList.add(loaiDichVu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return loaiDichVuList;
    }

    @Override
    public void addNewDichVu(Integer loaiDichVu, DichVu dichVu) {

        try (Connection connection = connectionDataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_VILLA);
             PreparedStatement preparedStatement2 = connection.prepareStatement(INSERT_HOUSE);
             PreparedStatement preparedStatement3 = connection.prepareStatement(INSERT_ROOM);) {
            if (loaiDichVu == 1) {
                preparedStatement.setString(1, dichVu.getDichVuCode());
                preparedStatement.setString(2, dichVu.getTenDichVu());
                preparedStatement.setDouble(3, Double.parseDouble(dichVu.getDienTich()));
                preparedStatement.setDouble(4, Double.parseDouble(dichVu.getChiPhiThue()));
                preparedStatement.setInt(5, Integer.parseInt(dichVu.getSoNguoiToiDa()));
                preparedStatement.setInt(6, dichVu.getKieuThue());
                preparedStatement.setInt(7, dichVu.getLoaiDichVu());
                preparedStatement.setString(8, dichVu.getTieuChuanPhong());
                Villa newVilla = (Villa) dichVu;
                preparedStatement.setString(9, newVilla.getMoTaTienNghiKhac());
                preparedStatement.setDouble(10, Double.parseDouble(newVilla.getDienTichHoBoi()));
                preparedStatement.setInt(11, Integer.parseInt(newVilla.getSoTang()));
                preparedStatement.executeUpdate();
            }
            if (loaiDichVu == 2) {
                preparedStatement2.setString(1, dichVu.getDichVuCode());
                preparedStatement2.setString(2, dichVu.getTenDichVu());
                preparedStatement2.setDouble(3, Double.parseDouble(dichVu.getDienTich()));
                preparedStatement2.setDouble(4, Double.parseDouble(dichVu.getChiPhiThue()));
                preparedStatement2.setInt(5, Integer.parseInt(dichVu.getSoNguoiToiDa()));
                preparedStatement2.setInt(6, dichVu.getKieuThue());
                preparedStatement2.setInt(7, dichVu.getLoaiDichVu());
                preparedStatement2.setString(8, dichVu.getTieuChuanPhong());
                House newHouse = (House) dichVu;
                preparedStatement2.setString(9, newHouse.getMoTaTienNghiKhac());
                preparedStatement2.setInt(10, Integer.parseInt(newHouse.getSoTang()));
                preparedStatement2.executeUpdate();
            }
            if (loaiDichVu == 3) {
                preparedStatement3.setString(1, dichVu.getDichVuCode());
                preparedStatement3.setString(2, dichVu.getTenDichVu());
                preparedStatement3.setDouble(3, Double.parseDouble(dichVu.getDienTich()));
                preparedStatement3.setDouble(4, Double.parseDouble(dichVu.getChiPhiThue()));
                preparedStatement3.setInt(5, Integer.parseInt(dichVu.getSoNguoiToiDa()));
                preparedStatement3.setInt(6, dichVu.getKieuThue());
                preparedStatement3.setInt(7, dichVu.getLoaiDichVu());
                preparedStatement3.setString(8, dichVu.getTieuChuanPhong());
                Room newRoom = (Room) dichVu;
                preparedStatement3.setString(9, newRoom.getMoTaTienNghiKhac());
                preparedStatement3.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean checkDichVuCodeExist(String code) {
        boolean check = false;
        List<FullDichVuDTO> list = this.getAllDichVu();
        for (FullDichVuDTO ls : list) {
            if (ls.getDichVuCode().equals(code)) {
                check = true;
                break;
            }
        }
        return check;
    }

}
