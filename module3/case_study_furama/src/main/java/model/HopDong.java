package model;

public class HopDong {
    private Integer maHopDong ;
    private String ngayBatDau ;
    private String ngayKetThuc ;
    private Integer tienDatCoc ;
    private Integer tongTienThanhToan ;

    public HopDong() {
    }

    public HopDong(Integer maHopDong, String ngayBatDau, String ngayKetThuc, Integer tienDatCoc, Integer tongTienThanhToan) {
        this.maHopDong = maHopDong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.tienDatCoc = tienDatCoc;
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public Integer getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(Integer maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Integer getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(Integer tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public Integer getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(Integer tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }
}
