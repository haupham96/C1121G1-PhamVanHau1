package repository;

import data_transfer_object.ContractDTO;
import data_transfer_object.ContractDetailDTO;
import model.*;

import java.util.List;
import java.util.Map;

public interface IContractRepository {
    List<ContractDTO> getAllContractDTO();

    List<MaNhanVien> getAllMaNhanVien();

    List<MaKhachHang> getAllMaKhachHang();

    List<MaDichVu> getAllMaDichVu();

    void createNewContract(Contract contract);

    List<ContractDetailDTO> getAllContractDetail();

    List<DichVuDiKem> getAllDichVuDiKem();

    void createNewContractDetail(ContractDetail contractDetail);

    List<KhachHangSuDungDichVuDiKem> getAllCustomersUseService();

    ContractDetail getContractDetail(Integer id);

    void updateContractDetail(ContractDetail contractDetailUpdate);
}
