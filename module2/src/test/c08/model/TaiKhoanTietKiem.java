package test.c08.model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    private String soTienGuiTietKiem;
    private String ngayGuiTietKiem;
    private double laiSuat;
    private int kyHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(int ID, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soTienGuiTietKiem, String ngayGuiTietKiem, double laiSuat, int kyHan) {
        super(ID, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kyHan = kyHan;
    }

    public String getSoTienGuiTietKiem() {
        return soTienGuiTietKiem;
    }

    public void setSoTienGuiTietKiem(String soTienGuiTietKiem) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public int getKyHan() {
        return kyHan;
    }

    public void setKyHan(int kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" + super.toString() +
                " , soTienGuiTietKiem='" + soTienGuiTietKiem + '\'' +
                ", ngayGuiTietKiem='" + ngayGuiTietKiem + '\'' +
                ", laiSuat=" + laiSuat +
                ", kyHan=" + kyHan +
                '}';
    }

    @Override
    public String getString() {
        return super.getString() + "," + this.soTienGuiTietKiem + "," + this.ngayGuiTietKiem + "," + this.laiSuat + "," + this.kyHan;
    }
}
