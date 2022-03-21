package service.impl;


import data_transfer_object.DichVuDTO;
import data_transfer_object.FullDichVuDTO;
import model.*;
import repository.IDichVuRepository;
import repository.impl.DichVuRepository;
import service.IDichVuSerVice;
import service.Regex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DichVuService implements IDichVuSerVice {
    IDichVuRepository dichVuRepository = new DichVuRepository();

    @Override
    public List<FullDichVuDTO> getAllDichVu() {
        return dichVuRepository.getAllDichVu();
    }

    @Override
    public List<KieuThue> getAllKieuThue() {
        return dichVuRepository.getAllKieuThue();
    }

    @Override
    public List<LoaiDichVu> getAllLoaiDichVu() {
        return dichVuRepository.getAllLoaiDichVu();
    }

    @Override
    public Map<String, String> addNewDichVu(Integer loaiDichVu, DichVu dichVu) {
        Map<String, String> map = new HashMap<>();
        boolean check = true;
        if(dichVu.getTenDichVu().equals("")){
            check = false ;
            map.put("tenDichVu","không được để trống");
        }
        if(dichVu.getDienTich().equals("")){
            check = false ;
            map.put("dienTich","không được để trống");
        }
        if(dichVu.getChiPhiThue().equals("")){
            check = false ;
            map.put("chiPhiThue","không được để trống");
        }
        if(dichVu.getSoNguoiToiDa().equals("")){
            check = false ;
            map.put("soNguoiToiDa","không được để trống");
        }
        if(!(dichVu.getDienTich().matches(Regex.SO_THUC))){
            check=false;
            map.put("dienTich","phải là số thực");
        }
        if(!dichVu.getChiPhiThue().matches(Regex.SO_THUC)){
            check=false;
            map.put("chiPhiThue","phải là số thực");
        }
        if(!dichVu.getSoNguoiToiDa().matches(Regex.SO_DUONG)){
            check=false;
            map.put("soNguoiToiDa","phải là số dương");
        }
        if (loaiDichVu == 1) {
            Villa villa = (Villa) dichVu;
            if (!villa.getDienTichHoBoi().matches(Regex.SO_THUC)) {
                check = false;
                map.put("dienTichHoBoi", "phải là số thực");
            }
            if (!villa.getSoTang().matches(Regex.SO_DUONG)) {
                check = false;
                map.put("soTang", "phải là số dương");
            }
            if(villa.getMoTaTienNghiKhac().equals("")){
                check=false;
                map.put("moTaTienNghiKhac","không được để trống");
            }
        }
        if(loaiDichVu == 2){
            House house = (House) dichVu;
            if(!house.getSoTang().matches(Regex.SO_DUONG)){
                check = false;
                map.put("soTang", "phải là số dương");
            }
            if(house.getMoTaTienNghiKhac().equals("")){
                check=false;
                map.put("moTaTienNghiKhac","không được để trống");
            }
        }
        if(loaiDichVu==3){
            Room room = (Room) dichVu;
            if(room.getMoTaTienNghiKhac().equals("")){
                check=false;
                map.put("moTaTienNghiKhac","không được để trống");
            }
        }
        if (check) {
            dichVuRepository.addNewDichVu(loaiDichVu, dichVu);
        }
        return map;
    }
}
