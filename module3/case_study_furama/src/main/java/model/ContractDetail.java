package model;

public class ContractDetail {
    private Integer maHopDongChiTiet;
    private Integer maHopDong;
    private Integer maDichVuDiKem;
    private String soLuong;

    public ContractDetail() {
    }

    public ContractDetail(Integer maHopDong, Integer maDichVuDiKem, String soLuong) {
        this.maHopDong = maHopDong;
        this.maDichVuDiKem = maDichVuDiKem;
        this.soLuong = soLuong;
    }

    public ContractDetail(Integer maHopDongChiTiet, Integer maHopDong, Integer maDichVuDiKem, String soLuong) {
        this.maHopDongChiTiet = maHopDongChiTiet;
        this.maHopDong = maHopDong;
        this.maDichVuDiKem = maDichVuDiKem;
        this.soLuong = soLuong;
    }

    public Integer getMaHopDongChiTiet() {
        return maHopDongChiTiet;
    }

    public void setMaHopDongChiTiet(Integer maHopDongChiTiet) {
        this.maHopDongChiTiet = maHopDongChiTiet;
    }

    public Integer getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(Integer maHopDong) {
        this.maHopDong = maHopDong;
    }

    public Integer getMaDichVuDiKem() {
        return maDichVuDiKem;
    }

    public void setMaDichVuDiKem(Integer maDichVuDiKem) {
        this.maDichVuDiKem = maDichVuDiKem;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
}
