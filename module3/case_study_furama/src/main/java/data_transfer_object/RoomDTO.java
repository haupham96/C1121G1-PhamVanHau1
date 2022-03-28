package data_transfer_object;

public class RoomDTO extends DichVuDTO{
    private String moTaTienNghiKhac ;
    private String dichVuMienPhiDiKem ;

    public RoomDTO() {
    }

    public RoomDTO(String dichVuCode,Integer maDichVu, String tenDichVu, Double dienTich, Double chiPhiThue, Integer soNguoiToiDa, String kieuThue, String loaiDichVu, String moTaTienNghiKhac, String dichVuMienPhiDiKem) {
        super(dichVuCode,maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu);
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }
}
