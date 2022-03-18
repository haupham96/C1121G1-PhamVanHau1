package service.impl;

import data_transfer_object.KhachHangDTO;
import model.KhachHang;
import model.LoaiKhach;
import repository.IKhachHangRepository;
import repository.impl.KhachHangRepository;
import service.IKhachHangService;
import service.Regex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KhachHangService implements IKhachHangService {

    IKhachHangRepository khachHangRepository = new KhachHangRepository();
    @Override
    public List<KhachHang> getAllCustomer() {
        return khachHangRepository.getAllCustomer();
    }

    @Override
    public List<LoaiKhach> getAllLoaiKhach() {
        return khachHangRepository.getAllLoaiKhach();
    }

    @Override
    public List<KhachHangDTO> getAllCustomerWithCustomerClass() {
        return khachHangRepository.getAllCustomerWithCustomerClass();
    }

    @Override
    public Map<String, String> addNewCustomer(KhachHang khachHang) {
        Map<String,String> map = new HashMap<>();
        boolean check = true ;

        if(!khachHang.getEmail().matches(Regex.EMAIL)){
            map.put("email","sai định dạng email (vd : ab_A.c123@gmail.com)");
            check = false ;
        }
        if(!khachHang.getHoTen().matches(Regex.NAME_VIETNAM)){
            map.put("hoTen","Sai định dạng họ tên (vd : Phạm Văn Hậu)");
            check = false ;
        }
        if(!khachHang.getNgaySinh().matches(Regex.YYYY_MM_DD)){
            map.put("ngaySinh","Sai định dạng ngày sinh (vd : 2000-02-28");
            check = false ;
        } else {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate ngaySinh = LocalDate.parse(khachHang.getNgaySinh(),fmt);
            LocalDate now = LocalDate.now();
            if(now.compareTo(ngaySinh) < 18){
                map.put("ngaySinh","khách hàng phải lớn hơn 18 tuổi");
                check = false ;
            }
        }
        if(!(khachHang.getSoCMND().matches(Regex.NUMBER))){
            map.put("soCMND","sai định dạng CMND (VD : 025871516 ");
            check = false ;
        }
        if(!khachHang.getSoDienThoai().matches(Regex.NUMBER)){
            map.put("soDienThoai","  vui lòng nhập số ");
            check = false ;
        }
        if(check){
            khachHangRepository.addNewCustomer(khachHang);
        }
        return map;
    }

    @Override
    public KhachHang findCustomerById(Integer id) {
        return khachHangRepository.findCustomerById(id);
    }

    @Override
    public Map<String, String> editCustomer(KhachHang khachHang) {
        boolean check = true;
        Map<String,String> map = new HashMap<>();
        if(!khachHang.getEmail().matches(Regex.EMAIL)){
            map.put("email","sai định dạng email (vd : ab_A.c123@gmail.com)");
            check = false ;
        }
        if(!khachHang.getHoTen().matches(Regex.NAME_VIETNAM)){
            map.put("hoTen","Sai định dạng họ tên (vd : Phạm Văn Hậu)");
            check = false ;
        }
        if(!khachHang.getNgaySinh().matches(Regex.YYYY_MM_DD)){
            map.put("ngaySinh","Sai định dạng ngày sinh (vd : 2000-02-28");
            check = false ;
        } else {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate ngaySinh = LocalDate.parse(khachHang.getNgaySinh(),fmt);
            LocalDate now = LocalDate.now();
            if(now.compareTo(ngaySinh) < 18){
                map.put("ngaySinh","khách hàng phải lớn hơn 18 tuổi");
                check = false ;
            }
        }
        if(!(khachHang.getSoCMND().matches(Regex.NUMBER))){
            map.put("soCMND","sai định dạng CMND (VD : 025871516 ");
            check = false ;
        }
        if(!khachHang.getSoDienThoai().matches(Regex.NUMBER)){
            map.put("soDienThoai","  vui lòng nhập số ");
            check = false ;
        }
        if(check){
            khachHangRepository.editCustomer(khachHang);
        }
        return map;
    }
}
