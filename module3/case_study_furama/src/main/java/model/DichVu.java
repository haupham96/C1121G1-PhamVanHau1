package model;

public abstract class DichVu {
    private String dichVuCode ;
    private Integer maDichVu ;
    private String tenDichVu ;
    private String dienTich ;
    private String chiPhiThue ;
    private String soNguoiToiDa ;
    private Integer kieuThue ;
    private Integer loaiDichVu ;
    private String tieuChuanPhong ;

    public DichVu() {
    }

    public DichVu(String dichVuCode, Integer maDichVu, String tenDichVu, String dienTich, String chiPhiThue, String soNguoiToiDa, Integer kieuThue, Integer loaiDichVu, String tieuChuanPhong) {
        this.dichVuCode = dichVuCode;
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
        this.loaiDichVu = loaiDichVu;
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public DichVu(String dichVuCode, String tenDichVu, String dienTich, String chiPhiThue, String soNguoiToiDa, Integer kieuThue, Integer loaiDichVu, String tieuChuanPhong) {
        this.dichVuCode = dichVuCode;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
        this.loaiDichVu = loaiDichVu;
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getDichVuCode() {
        return dichVuCode;
    }

    public void setDichVuCode(String dichVuCode) {
        this.dichVuCode = dichVuCode;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
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

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(String soNguoiToiDa) {
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
