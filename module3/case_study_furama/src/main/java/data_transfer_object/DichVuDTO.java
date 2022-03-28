package data_transfer_object;

public abstract class DichVuDTO {
    private String dichVuCode ;
    private Integer maDichVu ;
    private String tenDichVu ;
    private Double dienTich ;
    private Double chiPhiThue ;
    private Integer soNguoiToiDa ;
    private String kieuThue ;
    private String loaiDichVu ;

    public DichVuDTO() {
    }

    public DichVuDTO(String dichVuCode, Integer maDichVu, String tenDichVu, Double dienTich, Double chiPhiThue, Integer soNguoiToiDa, String kieuThue, String loaiDichVu) {
        this.dichVuCode = dichVuCode;
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
        this.loaiDichVu = loaiDichVu;
    }

    public String getDichVuCode() {
        return dichVuCode;
    }

    public void setDichVuCode(String dichVuCode) {
        this.dichVuCode = dichVuCode;
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

    public Double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public Integer getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(Integer soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }
}
