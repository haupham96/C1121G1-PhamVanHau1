package service.impl;

import data_transfer_object.ContractDTO;
import data_transfer_object.ContractDetailDTO;
import model.*;
import repository.IContractRepository;
import repository.impl.ContractRepository;
import service.IContractService;
import service.Regex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractService implements IContractService {
    IContractRepository contractRepository = new ContractRepository();

    @Override
    public List<ContractDTO> getAllContractDTO() {
        return contractRepository.getAllContractDTO();
    }

    @Override
    public List<MaNhanVien> getAllMaNhanVien() {
        return contractRepository.getAllMaNhanVien();
    }

    @Override
    public List<MaKhachHang> getAllMaKhachHang() {
        return contractRepository.getAllMaKhachHang();
    }

    @Override
    public List<MaDichVu> getAllMaDichVu() {
        return contractRepository.getAllMaDichVu();
    }

    @Override
    public Map<String, String> createNewContract(Contract contract) {
        boolean check = true ;
        Map<String,String> map = new HashMap<>() ;
        if(!contract.getNgayLamHopDong().matches(Regex.YYYY_MM_DD)){
            check= false ;
            map.put("ngayLamHopDong","Sai định dạng (vd : 1999-12-31)");
        }
        if(!contract.getNgayKetThuc().matches(Regex.YYYY_MM_DD)){
            check= false ;
            map.put("ngayKetThuc","Sai định dạng (vd : 1999-12-31)");
        } else {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate ngayBatDau = LocalDate.parse(contract.getNgayLamHopDong(),fmt);
            LocalDate ngayKetThuc = LocalDate.parse(contract.getNgayKetThuc(),fmt);
            if(ngayBatDau.isAfter(ngayKetThuc)){
                check= false ;
                map.put("ngayKetThuc","ngày kết thúc phải lớn hơn ngày bắt đầu");
            }
        }
        if(!contract.getTienDatCoc().matches(Regex.NUMBER)){
            check= false ;
            map.put("tienDatCoc","phải là số dương");
        }
        if(check){
            contractRepository.createNewContract(contract);
        }
        return map ;
    }

    @Override
    public List<ContractDetailDTO> getAllContractDetail() {
        return contractRepository.getAllContractDetail();
    }

    @Override
    public List<DichVuDiKem> getAllDichVuDiKem() {
        return contractRepository.getAllDichVuDiKem();
    }

    @Override
    public Map<String, String> createNewContractDetail(ContractDetail contractDetail) {
        Map<String,String> map = new HashMap<>();
        boolean check = true ;
        if(!contractDetail.getSoLuong().matches(Regex.NUMBER)){
            map.put("soLuong","Hãy nhập số");
            check = false ;
        }
        if(check){
            contractRepository.createNewContractDetail(contractDetail);
        }
        return map;
    }

    @Override
    public List<KhachHangSuDungDichVuDiKem> getAllCustomersUseService() {
        return contractRepository.getAllCustomersUseService();
    }

    @Override
    public ContractDetail getContractDetail(Integer id) {
        return contractRepository.getContractDetail(id);
    }

    @Override
    public Map<String, String> updateContractDetail(ContractDetail contractDetailUpdate) {
        Map<String,String> map = new HashMap<>();
        boolean check = true ;
        if(!contractDetailUpdate.getSoLuong().matches(Regex.NUMBER)){
            map.put("soLuong","hãy nhập số");
            check = false ;
        }
        if(check){
            contractRepository.updateContractDetail(contractDetailUpdate);
        }
        return map;
    }

    @Override
    public void deleteContractById(Integer id) {
        contractRepository.deleteContractById(id);
    }

    @Override
    public List<TinhTienKhachHang> thanhToanKhachHang() {
        return contractRepository.thanhToanKhachHang();
    }
}
