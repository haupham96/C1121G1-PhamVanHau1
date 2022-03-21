package model;

public class House extends DichVu{
    private String moTaTienNghiKhac;
    private String soTang ;

    public House() {
    }

    public House(String tenDichVu, String dienTich, String chiPhiThue, String soNguoiToiDa, Integer kieuThue, Integer loaiDichVu, String tieuChuanPhong, String moTaTienNghiKhac, String soTang) {
        super(tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu, tieuChuanPhong);
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    public House(Integer maDichVu, String tenDichVu, String dienTich, String chiPhiThue, String soNguoiToiDa, Integer kieuThue, Integer loaiDichVu, String tieuChuanPhong, String moTaTienNghiKhac, String soTang) {
        super(maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu, tieuChuanPhong);
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }
}
