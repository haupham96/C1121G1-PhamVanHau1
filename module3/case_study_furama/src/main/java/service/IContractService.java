package service;

import data_transfer_object.ContractDTO;
import data_transfer_object.ContractDetailDTO;
import model.*;

import java.util.List;
import java.util.Map;

public interface IContractService {
    List<ContractDTO> getAllContractDTO();

    List<MaNhanVien> getAllMaNhanVien();

    List<MaKhachHang> getAllMaKhachHang();

    List<MaDichVu> getAllMaDichVu();

    Map<String, String> createNewContract(Contract contract);

    List<ContractDetailDTO> getAllContractDetail();

    List<DichVuDiKem> getAllDichVuDiKem();

    Map<String, String> createNewContractDetail(ContractDetail contractDetail);

    List<KhachHangSuDungDichVuDiKem> getAllCustomersUseService();

    ContractDetail getContractDetail(Integer id);

    Map<String, String> updateContractDetail(ContractDetail contractDetailUpdate);

    void deleteContractById(Integer id);

    List<TinhTienKhachHang> thanhToanKhachHang();
}
