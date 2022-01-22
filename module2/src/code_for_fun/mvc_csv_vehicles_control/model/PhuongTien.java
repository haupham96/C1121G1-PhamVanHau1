package code_for_fun.mvc_csv_vehicles_control.model;

public abstract class PhuongTien {
    String bienKiemSoat;
    String tenHangSX;
    int namSX;
    String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSX = tenHangSX;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }

    public String getInFor(){
        return this.bienKiemSoat+","+this.tenHangSX+","+this.namSX+","+this.chuSoHuu;
    }
}
