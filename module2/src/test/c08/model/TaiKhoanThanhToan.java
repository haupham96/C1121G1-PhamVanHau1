package test.c08.model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private String soThe;
    private String soTienTrongTaiKhoan;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(int ID, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soThe, String soTienTrongTaiKhoan) {
        super(ID, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(String soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" + super.toString() +
                " , soThe='" + soThe + '\'' +
                ", soTienTrongTaiKhoan='" + soTienTrongTaiKhoan + '\'' +
                '}';
    }

    @Override
    public String getString() {
        return super.getString() + "," + this.soThe + "," + this.soTienTrongTaiKhoan;
    }
}
