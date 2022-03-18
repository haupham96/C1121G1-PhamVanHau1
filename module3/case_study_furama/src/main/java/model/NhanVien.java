package model;

public class NhanVien {
   private Integer maNhanVien ;
   private String hoTen;
   private String ngaySinh ;
   private String soCMND ;
   private String soDienThoai;
   private String email ;
   private Integer trinhDo ;
   private Integer viTri ;
   private Integer boPhan ;
   private Integer luong ;

    public NhanVien() {
    }

    public NhanVien(Integer maNhanVien, String hoTen, String ngaySinh, String soCMND, String soDienThoai, String email, Integer trinhDo, Integer viTri, Integer boPhan, Integer luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.boPhan = boPhan;
        this.luong = luong;
    }

    public Integer getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(Integer trinhDo) {
        this.trinhDo = trinhDo;
    }

    public Integer getViTri() {
        return viTri;
    }

    public void setViTri(Integer viTri) {
        this.viTri = viTri;
    }

    public Integer getLuong() {
        return luong;
    }

    public void setLuong(Integer luong) {
        this.luong = luong;
    }

    public Integer getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(Integer boPhan) {
        this.boPhan = boPhan;
    }
}
