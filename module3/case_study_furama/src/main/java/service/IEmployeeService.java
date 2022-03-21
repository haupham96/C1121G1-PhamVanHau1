package service;

import data_transfer_object.NhanVienDTO;
import model.BoPhan;
import model.NhanVien;
import model.TrinhDo;
import model.ViTri;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
    List<NhanVienDTO> getAllEmployee();

    List<ViTri> getAllPosition();

    List<TrinhDo> getAllTrinhDo();

    List<BoPhan> getAllBoPhan();

    Map<String, String> addNewEmployee(NhanVien nhanVien);

    List<NhanVienDTO> searchByName(String searchName);

    Map<String, String> editEmployee(NhanVien nhanVien);

    NhanVien findEmployeeById(Integer maNhanVien);
}
