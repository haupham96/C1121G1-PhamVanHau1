package data_transfer_object;

public class HouseDTO extends DichVuDTO{
    private String tieuChuanPhong;
    private String moTaTienNghiKhac;
    private Integer soTang ;

    public HouseDTO() {
    }

    public HouseDTO(String dichVuCode,Integer maDichVu, String tenDichVu, Double dienTich, Double chiPhiThue, Integer soNguoiToiDa, String kieuThue, String loaiDichVu, String tieuChuanPhong, String moTaTienNghiKhac, Integer soTang) {
        super(dichVuCode,maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
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

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }
}
