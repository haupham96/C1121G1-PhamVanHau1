package ss12_java_collection_framework.exercise.vehicles_control_mvc.model;

public class XeMay extends PhuongTien{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String hangSanxuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanxuat, namSanXuat, chuSoHuu);
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
        return "Xe Máy {" +
                super.toString()+" , "+
                "congSuat='" + congSuat + '\'' +
                '}';
    }
}
