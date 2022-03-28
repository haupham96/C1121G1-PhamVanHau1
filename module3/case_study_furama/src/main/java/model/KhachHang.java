package model;

public class KhachHang {
    private Integer maKhachHang;
    private String hoTen;
    private String ngaySinh;
    private Integer gioiTinh;
    private String soCMND;
    private String soDienThoai;
    private String email;
    private Integer loaiKhach;
    private String diaChi;
    private String khachHangCode ;

    public KhachHang() {
    }

    public KhachHang(Integer maKhachHang, String hoTen, String ngaySinh, Integer gioiTinh, String soCMND, String soDienThoai, String email, Integer loaiKhach, String diaChi, String khachHangCode) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.khachHangCode = khachHangCode;
    }

    public KhachHang(String hoTen, String ngaySinh, Integer gioiTinh, String soCMND, String soDienThoai, String email, Integer loaiKhach, String diaChi, String khachHangCode) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.khachHangCode = khachHangCode;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
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

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
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

    public Integer getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(Integer loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getKhachHangCode() {
        return khachHangCode;
    }

    public void setKhachHangCode(String khachHangCode) {
        this.khachHangCode = khachHangCode;
    }
}
