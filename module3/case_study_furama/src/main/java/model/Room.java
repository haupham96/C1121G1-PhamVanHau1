package model;

public class Room extends DichVu {
    private Integer dichVuDiKem;

    public Room() {
    }

    public Room(Integer maDichVu, String tenDichVu, Double dienTich, Integer chiPhiThue, Integer soNguoiToiDa, Integer kieuThue, Integer loaiDichVu, Integer dichVuDiKem) {
        super(maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu);
        this.dichVuDiKem = dichVuDiKem;
    }

    public Integer getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(Integer dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }
}

