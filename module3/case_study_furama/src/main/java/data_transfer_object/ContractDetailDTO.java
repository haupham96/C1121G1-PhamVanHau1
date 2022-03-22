package data_transfer_object;

public class ContractDetailDTO {
    private Integer maHopDongChiTiet;
    private String maHopDong;
    private String maDichVuDiKem;
    private String soLuong;

    public ContractDetailDTO() {
    }

    public ContractDetailDTO(Integer maHopDongChiTiet, String maHopDong, String maDichVuDiKem, String soLuong) {
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

    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getMaDichVuDiKem() {
        return maDichVuDiKem;
    }

    public void setMaDichVuDiKem(String maDichVuDiKem) {
        this.maDichVuDiKem = maDichVuDiKem;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
}
