package service;

import data_transfer_object.DichVuDTO;
import data_transfer_object.FullDichVuDTO;
import model.DichVu;
import model.KieuThue;
import model.LoaiDichVu;

import java.util.List;
import java.util.Map;

public interface IDichVuSerVice {
    List<FullDichVuDTO> getAllDichVu();

    List<KieuThue> getAllKieuThue();

    List<LoaiDichVu> getAllLoaiDichVu();

    Map<String, String> addNewDichVu(Integer loaiDichVu, DichVu dichVu);
}
