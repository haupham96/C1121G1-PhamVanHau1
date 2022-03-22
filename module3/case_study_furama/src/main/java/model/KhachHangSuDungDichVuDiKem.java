package model;

public class KhachHangSuDungDichVuDiKem {
    private Integer maHopDongChiTiet ;
    private String hoTen ;
    private String dichVuDiKem ;
    private String soLuong ;

    public KhachHangSuDungDichVuDiKem() {
    }

    public KhachHangSuDungDichVuDiKem(Integer maHopDongChiTiet, String hoTen, String dichVuDiKem, String soLuong) {
        this.maHopDongChiTiet = maHopDongChiTiet;
        this.hoTen = hoTen;
        this.dichVuDiKem = dichVuDiKem;
        this.soLuong = soLuong;
    }

    public Integer getMaHopDongChiTiet() {
        return maHopDongChiTiet;
    }

    public void setMaHopDongChiTiet(Integer maHopDongChiTiet) {
        this.maHopDongChiTiet = maHopDongChiTiet;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

}
