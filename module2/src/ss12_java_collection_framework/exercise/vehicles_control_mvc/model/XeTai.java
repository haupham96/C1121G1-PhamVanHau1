package ss12_java_collection_framework.exercise.vehicles_control_mvc.model;

public class XeTai extends PhuongTien{
    private int taiTrong ;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String hangSanxuat, int namSanXuat, String chuSoHuu, int taiTrong) {
        super(bienKiemSoat, hangSanxuat, namSanXuat, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    public int getTaiTrong() {
        return taiTrong;
    }

    @Override
    public String toString() {
        return "Xe Tải{" +
                super.toString()+" , "+
                "taiTrong='" + taiTrong + '\'' +
                '}';
    }
}
