package model;

public class Room extends DichVu {
    private String moTaTienNghiKhac;
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String dichVuCode, String tenDichVu, String dienTich, String chiPhiThue, String soNguoiToiDa, Integer kieuThue, Integer loaiDichVu, String tieuChuanPhong, String moTaTienNghiKhac, String dichVuMienPhiDiKem) {
        super(dichVuCode, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu, tieuChuanPhong);
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public Room(String dichVuCode, Integer maDichVu, String tenDichVu, String dienTich, String chiPhiThue, String soNguoiToiDa, Integer kieuThue, Integer loaiDichVu, String tieuChuanPhong, String moTaTienNghiKhac, String dichVuMienPhiDiKem) {
        super(dichVuCode, maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu, tieuChuanPhong);
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }
}
