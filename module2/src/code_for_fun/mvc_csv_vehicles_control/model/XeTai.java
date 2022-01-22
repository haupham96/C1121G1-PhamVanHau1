package code_for_fun.mvc_csv_vehicles_control.model;

public class XeTai extends PhuongTien{
    private int taiTrong;

    public XeTai() {
    }
    //XeTai : 5 Constructor
    public XeTai(String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu, int taiTrong) {
        super(bienKiemSoat, tenHangSX, namSX, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public int getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                ", taiTrong=" + taiTrong +
                '}';
    }

    @Override
    public String getInFor(){
        return super.getInFor()+","+this.taiTrong;
    }
}
