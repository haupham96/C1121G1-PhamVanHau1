package ss12_java_collection_framework.exercise.vehicles_control_mvc.model;

public class PhuongTien {
    private String bienKiemSoat;
    private String hangSanxuat;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienKiemSoat, String hangSanxuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanxuat = hangSanxuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }


    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanxuat() {
        return hangSanxuat;
    }

    public void setHangSanxuat(String hangSanxuat) {
        this.hangSanxuat = hangSanxuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }


    @Override
    public String toString() {
        return
                "Biển Kiểm Soát :'" + bienKiemSoat + '\'' +
                ", Hãng Sản Xuất :'" + hangSanxuat + '\'' +
                ", Năm Sản Xuất :" + namSanXuat +
                ", Chủ Sở Hữu :'" + chuSoHuu + '\''
                ;
    }
}
