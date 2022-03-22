package data_transfer_object;

public class ContractDTO {
    private Integer maHopDong;
    private String ngayLamHopDong ;
    private String ngayKetThuc ;
    private String tienDatCoc ;
    private String maNhanVien ;
    private String maKhachHang ;
    private String maDichVu ;

    public ContractDTO() {
    }

    public ContractDTO(String ngayLamHopDong, String ngayKetThuc, String tienDatCoc, String maNhanVien, String maKhachHang, String maDichVu) {
        this.ngayLamHopDong = ngayLamHopDong;
        this.ngayKetThuc = ngayKetThuc;
        this.tienDatCoc = tienDatCoc;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
    }

    public ContractDTO(Integer maHopDong, String ngayLamHopDong, String ngayKetThuc, String tienDatCoc, String maNhanVien, String maKhachHang, String maDichVu) {
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

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }
}
