package model;

public class TinhTienKhachHang {
    private String hoTenKhachHang ;
    private String tenDichVu ;
    private String chiPhiThue ;
    private String tienDatCoc ;
    private String tienDichVuDiKem ;
    private String tongTien ;

    public TinhTienKhachHang() {
    }

    public TinhTienKhachHang(String hoTenKhachHang, String tenDichVu, String chiPhiThue, String tienDatCoc, String tienDichVuDiKem, String tongTien) {
        this.hoTenKhachHang = hoTenKhachHang;
        this.tenDichVu = tenDichVu;
        this.chiPhiThue = chiPhiThue;
        this.tienDatCoc = tienDatCoc;
        this.tienDichVuDiKem = tienDichVuDiKem;
        this.tongTien = tongTien;
    }

    public String getHoTenKhachHang() {
        return hoTenKhachHang;
    }

    public void setHoTenKhachHang(String hoTenKhachHang) {
        this.hoTenKhachHang = hoTenKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(String tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public String getTienDichVuDiKem() {
        return tienDichVuDiKem;
    }

    public void setTienDichVuDiKem(String tienDichVuDiKem) {
        this.tienDichVuDiKem = tienDichVuDiKem;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }
}
