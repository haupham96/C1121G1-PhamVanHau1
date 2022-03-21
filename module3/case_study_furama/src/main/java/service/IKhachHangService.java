package service;

import data_transfer_object.KhachHangDTO;
import model.KhachHang;
import model.LoaiKhach;

import java.util.List;
import java.util.Map;

public interface IKhachHangService {
    List<KhachHang> getAllCustomer();

    List<LoaiKhach> getAllLoaiKhach();

    List<KhachHangDTO> getAllCustomerWithCustomerClass();

    Map<String,String> addNewCustomer(KhachHang khachHang);

    KhachHang findCustomerById(Integer id);

    Map<String, String> editCustomer(KhachHang khachHang);

    void deleteCustomerById(Integer id);

    List<KhachHangDTO> searchByName(String searchName);
}
