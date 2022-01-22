package code_for_fun.mvc_csv_vehicles_control.model;

public class XeMay extends PhuongTien{
    private int congSuat;

    public XeMay() {
    }
//Xe Máy : 5 Constructor
    public XeMay(String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, tenHangSX, namSX, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                ", congSuat=" + congSuat +
                '}';
    }

    @Override
    public String getInFor(){
        return super.getInFor()+","+this.congSuat;
    }
}
