package code_for_fun.mvc_csv_vehicles_control.model;

public class XeOTo extends PhuongTien {
    private int soChoNgoi;
    private String kieuXe;

    public XeOTo() {
    }

    public XeOTo(String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSX, namSX, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "XeOTo{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                ", soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }

    @Override
    public String getInFor(){
        return super.getInFor()+","+this.soChoNgoi+","+this.kieuXe;
    }
}

