package ss12_java_collection_framework.exercise.vehicles_control_mvc.model;

public class PhuongTien {
    public static class HangSanXuat {
        private String maHang;
        private String tenHang;
        private String tenQuocGia;
        public HangSanXuat(){}

        public HangSanXuat(String maHang, String tenHang, String tenQuocGia) {
            this.maHang = maHang;
            this.tenHang = tenHang;
            this.tenQuocGia = tenQuocGia;
        }

        public String getMaHang() {
            return maHang;
        }

        public void setMaHang(String maHang) {
            this.maHang = maHang;
        }

        public String getTenHang() {
            return tenHang;
        }

        public void setTenHang(String tenHang) {
            this.tenHang = tenHang;
        }

        public String getTenQuocGia() {
            return tenQuocGia;
        }

        public void setTenQuocGia(String tenQuocGia) {
            this.tenQuocGia = tenQuocGia;
        }

        public String getAll(){
            return this.maHang +" "+ this.tenHang +" "+ this.tenQuocGia;
        }

    }
    private String bienKiemSoat;
    private String hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
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
        return this.hangSanXuat;
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
                        ", Hãng Sản Xuất :'" + this.hangSanXuat + '\'' +
                        ", Năm Sản Xuất :" + namSanXuat +
                        ", Chủ Sở Hữu :'" + chuSoHuu + '\''
                ;
    }
}
