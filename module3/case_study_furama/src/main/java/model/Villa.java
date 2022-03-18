package model;

public class Villa extends DichVu {
    private String tieuChuanPhong;
    private String moTaTienNghiKhac ;
    private Double dienTichHoBoi ;
    private Integer soTang ;

    public Villa() {
    }

    public Villa(Integer maDichVu, String tenDichVu, Double dienTich, Integer chiPhiThue, Integer soNguoiToiDa, Integer kieuThue, Integer loaiDichVu, String tieuChuanPhong, String moTaTienNghiKhac, Double dienTichHoBoi, Integer soTang) {
        super(maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public Double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(Double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }
}
