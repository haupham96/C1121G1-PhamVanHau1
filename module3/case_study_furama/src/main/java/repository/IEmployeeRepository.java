package repository;

import data_transfer_object.NhanVienDTO;
import model.BoPhan;
import model.NhanVien;
import model.TrinhDo;
import model.ViTri;

import java.util.List;

public interface IEmployeeRepository {
    List<NhanVienDTO> getAllEmployee();

    List<ViTri> getAllPosition();

    List<TrinhDo> getAllTrinhDo();

    List<BoPhan> getAllBoPhan();

    void addNewEmployee(NhanVien nhanVien);

    List<NhanVienDTO> searchByName(String searchName);

    void editEmployee(NhanVien nhanVien);

    NhanVien findEmployeeById(Integer maNhanVien);
}
