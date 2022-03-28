package data_transfer_object;

public class FullDichVuDTO extends DichVuDTO {
    private String tieuChuanPhong;
    private String moTaTienNghiKhac;
    private Double dienTichHoBoi;
    private Integer soTang;

    public FullDichVuDTO() {
    }

    public FullDichVuDTO(String dichVuCode, Integer maDichVu, String tenDichVu, Double dienTich, Double chiPhiThue, Integer soNguoiToiDa, String kieuThue, String loaiDichVu, String tieuChuanPhong, String moTaTienNghiKhac, Double dienTichHoBoi, Integer soTang) {
        super(dichVuCode, maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu);
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
