package model;

public class DichVuDiKem {
    private String tenDichVuDiKem ;
    private String donVi ;
    private Integer giaTien ;

    public DichVuDiKem() {
    }

    public DichVuDiKem(String tenDichVuDiKem, String donVi, Integer giaTien) {
        this.tenDichVuDiKem = tenDichVuDiKem;
        this.donVi = donVi;
        this.giaTien = giaTien;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public Integer getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Integer giaTien) {
        this.giaTien = giaTien;
    }
}
