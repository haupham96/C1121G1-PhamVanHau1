package repository;


import data_transfer_object.FullDichVuDTO;
import model.DichVu;
import model.KieuThue;
import model.LoaiDichVu;

import java.util.List;

public interface IDichVuRepository {
    List<FullDichVuDTO> getAllDichVu();

    List<KieuThue> getAllKieuThue();

    List<LoaiDichVu> getAllLoaiDichVu();

    void addNewDichVu(Integer loaiDichVu, DichVu dichVu);
}
