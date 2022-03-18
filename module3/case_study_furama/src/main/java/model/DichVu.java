package model;

public abstract class DichVu {
    private Integer maDichVu ;
    private String tenDichVu ;
    private Double dienTich ;
    private Integer chiPhiThue ;
    private Integer soNguoiToiDa ;
    private Integer kieuThue ;
    private Integer loaiDichVu ;

    public DichVu() {
    }

    public DichVu(Integer maDichVu, String tenDichVu, Double dienTich, Integer chiPhiThue, Integer soNguoiToiDa, Integer kieuThue, Integer loaiDichVu) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
        this.loaiDichVu = loaiDichVu;
    }

    public Integer getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(Integer maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public Integer getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Integer chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public Integer getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(Integer soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public Integer getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(Integer kieuThue) {
        this.kieuThue = kieuThue;
    }

    public Integer getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(Integer loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }
}
