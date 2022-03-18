package model;

public class LoaiKhach {
   private Integer maLoaiKhach;
   private String tenLoaiKhach;

    public LoaiKhach() {
    }

    public LoaiKhach(Integer maLoaiKhach, String tenLoaiKhach) {
        this.maLoaiKhach = maLoaiKhach;
        this.tenLoaiKhach = tenLoaiKhach;
    }

    public Integer getMaLoaiKhach() {
        return maLoaiKhach;
    }

    public void setMaLoaiKhach(Integer maLoaiKhach) {
        this.maLoaiKhach = maLoaiKhach;
    }

    public String getTenLoaiKhach() {
        return tenLoaiKhach;
    }

    public void setTenLoaiKhach(String tenLoaiKhach) {
        this.tenLoaiKhach = tenLoaiKhach;
    }
}
