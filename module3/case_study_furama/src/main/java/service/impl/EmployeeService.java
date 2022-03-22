package service.impl;

import data_transfer_object.NhanVienDTO;
import model.BoPhan;
import model.NhanVien;
import model.TrinhDo;
import model.ViTri;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;
import service.IEmployeeService;
import service.Regex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<NhanVienDTO> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    @Override
    public List<ViTri> getAllPosition() {
        return employeeRepository.getAllPosition();
    }

    @Override
    public List<TrinhDo> getAllTrinhDo() {
        return employeeRepository.getAllTrinhDo();
    }

    @Override
    public List<BoPhan> getAllBoPhan() {
        return employeeRepository.getAllBoPhan();
    }

    @Override
    public Map<String, String> addNewEmployee(NhanVien nhanVien) {
        Map<String,String> map = new HashMap<>();
        boolean check=true;
        if(nhanVien.getHoTen().equals("")){
            check=false;
            map.put("hoTen","không được để trống");
        }
        if(!nhanVien.getHoTen().matches(Regex.NAME_VIETNAM)){
            check=false;
            map.put("hoTen","không đúng định dạng ( VD : Phạm Văn Hậu )");
        }
        if(nhanVien.getNgaySinh().equals("")){
            check=false;
            map.put("ngaySinh","không được để trống");
        }
        if(!nhanVien.getNgaySinh().matches(Regex.YYYY_MM_DD)){
            check=false;
            map.put("ngaySinh","không đúng định dạng (vd : 2001-12-31)");
        }
        if(nhanVien.getSoCMND().equals("")){
            check=false;
            map.put("soCMND","không được để trống");
        }
        if(!nhanVien.getSoCMND().matches(Regex.NUMBER)){
            check=false;
            map.put("soCMND","Phải là số tự nhiên");
        }
        if(nhanVien.getLuong().equals("")){
            check=false;
            map.put("luong","không được để trống");
        }
        if(!nhanVien.getLuong().matches(Regex.SO_DUONG)){
            check=false;
            map.put("luong","phải là số nguyên dương");
        }
        if(!nhanVien.getSoDienThoai().matches(Regex.NUMBER)){
            check=false;
            map.put("soDienThoai","phải là số tự nhiên");
        }
        if(!nhanVien.getEmail().matches(Regex.EMAIL)){
            check=false;
            map.put("email","đúng định dạng (vd : hau123@gmail.com)");
        }
        if(nhanVien.getDiaChi().equals("")){
            check=false;
            map.put("diaChi","không được để trống");
        }
        if(check){
            employeeRepository.addNewEmployee(nhanVien);
        }
        return map;
    }

    @Override
    public List<NhanVienDTO> searchByName(String searchName) {
        return employeeRepository.searchByName(searchName);
    }

    @Override
    public Map<String, String> editEmployee(NhanVien nhanVien) {
        Map<String,String> map = new HashMap<>();
        boolean check=true;
        if(!nhanVien.getHoTen().matches(Regex.NAME_VIETNAM)){
            check=false;
            map.put("hoTen","không đúng định dạng ( VD : Phạm Văn Hậu )");
        }
        if(!nhanVien.getNgaySinh().matches(Regex.YYYY_MM_DD)){
            check=false;
            map.put("ngaySinh","không đúng định dạng (vd : 2001-12-31)");
        }
        if(!nhanVien.getSoCMND().matches(Regex.NUMBER)){
            check=false;
            map.put("soCMND","Phải là số tự nhiên");
        }
        if(!nhanVien.getLuong().matches(Regex.SO_DUONG)){
            check=false;
            map.put("luong","phải là số nguyên dương");
        }
        if(!nhanVien.getSoDienThoai().matches(Regex.NUMBER)){
            check=false;
            map.put("soDienThoai","phải là số tự nhiên");
        }
        if(!nhanVien.getEmail().matches(Regex.EMAIL)){
            check=false;
            map.put("email","đúng định dạng (vd : hau123@gmail.com)");
        }
        if(nhanVien.getDiaChi().equals("")){
            check=false;
            map.put("diaChi","không được để trống");
        }
        if(check){
            employeeRepository.editEmployee(nhanVien);
        }
        return map;
    }

    @Override
    public NhanVien findEmployeeById(Integer maNhanVien) {
        return employeeRepository.findEmployeeById(maNhanVien);
    }

    @Override
    public boolean deleteEmployeeById(Integer id) {
        return employeeRepository.deleteEmployeeById(id);
    }
}
