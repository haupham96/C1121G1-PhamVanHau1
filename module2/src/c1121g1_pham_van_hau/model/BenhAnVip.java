package c1121g1_pham_van_hau.model;

public class BenhAnVip extends BenhAn {
    private String loaiVip;
    private String thoiHanVip;

    public BenhAnVip() {
    }

    public BenhAnVip(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVip, String thoiHanVip) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" + super.toString()+
                " , loaiVip='" + loaiVip + '\'' +
                '}';
    }

    @Override
    public String layThongTin() {
        return super.layThongTin()+","+this.loaiVip+","+this.thoiHanVip;
    }
}
