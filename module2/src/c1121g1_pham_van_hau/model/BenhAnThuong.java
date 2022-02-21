package c1121g1_pham_van_hau.model;

public class BenhAnThuong extends BenhAn {
    private String phiNamVien;

    public BenhAnThuong() {
    }

    public BenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public String getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" + super.toString()+
                " , phiNamVien='" + phiNamVien + '\'' +
                '}';
    }

    @Override
    public String layThongTin() {
        return super.layThongTin()+","+this.phiNamVien;
    }
}
