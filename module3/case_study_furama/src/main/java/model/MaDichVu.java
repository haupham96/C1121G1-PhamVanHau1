package model;

public class MaDichVu {
    private Integer maDichVu ;
    private String tenDichVu ;
    private Integer loaiDichVu ;

    public MaDichVu() {
    }

    public MaDichVu(Integer maDichVu, String tenDichVu, Integer loaiDichVu) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public Integer getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(Integer loaiDichVu) {
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
}
