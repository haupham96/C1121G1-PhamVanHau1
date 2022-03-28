package repository;

import data_transfer_object.KhachHangDTO;
import model.KhachHang;
import model.LoaiKhach;

import java.util.List;

public interface IKhachHangRepository {
    List<KhachHang> getAllCustomer();

    List<LoaiKhach> getAllLoaiKhach();

    List<KhachHangDTO> getAllCustomerWithCustomerClass();

    void addNewCustomer(KhachHang khachHang);

    KhachHang findCustomerById(Integer id);

    void editCustomer(KhachHang khachHang);

    void deleteCustomerById(Integer id);

    List<KhachHangDTO> searchByName(String searchName);

    boolean checkCustomerCodeExist(String code);
}
