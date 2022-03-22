package model;

public class DichVuDiKem {
    private Integer maDichVuDiKem;
    private String tenDichVuDiKem;
    private String gia ;
    private String donVi ;
    private String trangThai ;

    public DichVuDiKem() {
    }

    public DichVuDiKem(Integer maDichVuDiKem, String tenDichVuDiKem, String gia, String donVi, String trangThai) {
        this.maDichVuDiKem = maDichVuDiKem;
        this.tenDichVuDiKem = tenDichVuDiKem;
        this.gia = gia;
        this.donVi = donVi;
        this.trangThai = trangThai;
    }

    public Integer getMaDichVuDiKem() {
        return maDichVuDiKem;
    }

    public void setMaDichVuDiKem(Integer maDichVuDiKem) {
        this.maDichVuDiKem = maDichVuDiKem;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
