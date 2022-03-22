package model;

public class Contract {
    private Integer maHopDong;
    private String ngayLamHopDong ;
    private String ngayKetThuc ;
    private String tienDatCoc ;
    private Integer maNhanVien ;
    private Integer maKhachHang ;
    private Integer maDichVu ;

    public Contract() {
    }

    public Contract(String ngayLamHopDong, String ngayKetThuc, String tienDatCoc, Integer maNhanVien, Integer maKhachHang, Integer maDichVu) {
        this.ngayLamHopDong = ngayLamHopDong;
        this.ngayKetThuc = ngayKetThuc;
        this.tienDatCoc = tienDatCoc;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
    }

    public Contract(Integer maHopDong, String ngayLamHopDong, String ngayKetThuc, String tienDatCoc, Integer maNhanVien, Integer maKhachHang, Integer maDichVu) {
        this.maHopDong = maHopDong;
        this.ngayLamHopDong = ngayLamHopDong;
        this.ngayKetThuc = ngayKetThuc;
        this.tienDatCoc = tienDatCoc;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
    }

    public Integer getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(Integer maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(String ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(String tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public Integer getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Integer getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(Integer maDichVu) {
        this.maDichVu = maDichVu;
    }
}
