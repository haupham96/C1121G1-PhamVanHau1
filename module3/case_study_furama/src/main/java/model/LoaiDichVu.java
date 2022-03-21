package model;

public class LoaiDichVu {
    private Integer maLoaiDichVu ;
    private String tenLoaiDichVu ;

    public LoaiDichVu() {
    }

    public LoaiDichVu(Integer maLoaiDichVu, String tenLoaiDichVu) {
        this.maLoaiDichVu = maLoaiDichVu;
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public Integer getMaLoaiDichVu() {
        return maLoaiDichVu;
    }

    public void setMaLoaiDichVu(Integer maLoaiDichVu) {
        this.maLoaiDichVu = maLoaiDichVu;
    }

    public String getTenLoaiDichVu() {
        return tenLoaiDichVu;
    }

    public void setTenLoaiDichVu(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }
}
