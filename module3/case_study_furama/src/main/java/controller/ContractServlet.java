package controller;

import data_transfer_object.ContractDTO;
import data_transfer_object.ContractDetailDTO;
import model.*;
import service.IContractService;
import service.impl.ContractService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ContractServlet", value = "/contract")
public class ContractServlet extends HttpServlet {
    IContractService contractService = new ContractService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "detail":
                listContractDeltail(request, response);
                break;
            case "create-detail":
                createContractDetailForm(request, response);
                break;
            case "dichvu-khachhang":
                listCustomersUseService(request, response);
                break;
            case "update-khachhang-dich-vu-di-kem":
                updateDichVuDiKemForm(request,response);
                break;
            case "xoa-khachhang-dich-vu-di-kem":

                break;
            default:
                listContract(request, response);
        }
    }

    private void updateDichVuDiKemForm(HttpServletRequest request, HttpServletResponse response) {
        Integer maHopDongChiTiet = Integer.valueOf(request.getParameter("maHopDongChiTiet"));
        ContractDetail contractDetai = contractService.getContractDetail(maHopDongChiTiet);
        List<DichVuDiKem> dichVuDiKemList = contractService.getAllDichVuDiKem();
        List<MaNhanVien> maNhanVienList = contractService.getAllMaNhanVien();
        request.setAttribute("contractDetai",contractDetai);
        request.setAttribute("dichVuDiKemList",dichVuDiKemList);
        request.setAttribute("maNhanVienList",maNhanVienList);
        try {
            request.getRequestDispatcher("/contract/edit-dichvudikem-khachhang.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void listCustomersUseService(HttpServletRequest request, HttpServletResponse response) {
        List<KhachHangSuDungDichVuDiKem> list = contractService.getAllCustomersUseService();
        request.setAttribute("list",list);
        try {
            request.getRequestDispatcher("/contract/dichvudikem-khachhang.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createContractDetailForm(HttpServletRequest request, HttpServletResponse response) {
        List<ContractDTO> list = contractService.getAllContractDTO();
        List<DichVuDiKem> dichVuDiKemList = contractService.getAllDichVuDiKem();
        request.setAttribute("list", list);
        request.setAttribute("dichVuDiKemList", dichVuDiKemList);
        try {
            request.getRequestDispatcher("/contract/create-contract-detail.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listContractDeltail(HttpServletRequest request, HttpServletResponse response) {
        List<ContractDetailDTO> list = contractService.getAllContractDetail();
        request.setAttribute("list", list);
        try {
            request.getRequestDispatcher("/contract/list-contract-detail.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<MaNhanVien> maNhanVienList = contractService.getAllMaNhanVien();
        List<MaKhachHang> maKhachHangList = contractService.getAllMaKhachHang();
        List<MaDichVu> maDichVuList = contractService.getAllMaDichVu();

        request.setAttribute("maNhanVienList", maNhanVienList);
        request.setAttribute("maKhachHangList", maKhachHangList);
        request.setAttribute("maDichVuList", maDichVuList);
        try {
            request.getRequestDispatcher("/contract/create-contract.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listContract(HttpServletRequest request, HttpServletResponse response) {
        List<ContractDTO> list = contractService.getAllContractDTO();
        request.setAttribute("list", list);
        try {
            request.getRequestDispatcher("/contract/list-contract.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createContract(request, response);
                break;
            case "create-detail":
                createContractDetail(request, response);
                break;
            case "update-khachhang-dich-vu-di-kem":
                updateDichVuDiKem(request,response);
                break;
        }
    }

    private void updateDichVuDiKem(HttpServletRequest request, HttpServletResponse response) {
        Integer maHopDongchiTiet = Integer.valueOf(request.getParameter("maHopDongChiTiet"));
        Integer maNhanVien = Integer.valueOf(request.getParameter("maNhanVien"));
        Integer maDichVuDiKem = Integer.valueOf(request.getParameter("dichVuDiKem"));
        String soLuong = request.getParameter("soLuong");
        ContractDetail contractDetail = contractService.getContractDetail(maHopDongchiTiet);

        ContractDetail contractDetailUpdate = new ContractDetail(maHopDongchiTiet,contractDetail.getMaHopDong(),maDichVuDiKem,soLuong);
        Map<String,String> map = contractService.updateContractDetail(contractDetailUpdate);
        List<DichVuDiKem> dichVuDiKemList = contractService.getAllDichVuDiKem();
        List<MaNhanVien> maNhanVienList = contractService.getAllMaNhanVien();
        if(map.isEmpty()){
            request.setAttribute("dichVuDiKemList",dichVuDiKemList);
            request.setAttribute("maNhanVienList",maNhanVienList);
            request.setAttribute("message","chỉnh sửa thành công");
        } else {
            request.setAttribute("dichVuDiKemList",dichVuDiKemList);
            request.setAttribute("maNhanVienList",maNhanVienList);
            request.setAttribute("errors",map);
        }
        try {
            request.getRequestDispatcher("/contract/edit-dichvudikem-khachhang.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createContractDetail(HttpServletRequest request, HttpServletResponse response) {
        Integer maHopDong = Integer.valueOf(request.getParameter("maHopDong"));
        Integer maDichVuDiKem = Integer.valueOf(request.getParameter("dichVuDiKem"));
        String soLuong = request.getParameter("soLuong");
        ContractDetail contractDetail = new ContractDetail(maHopDong, maDichVuDiKem, soLuong);
        Map<String, String> map = contractService.createNewContractDetail(contractDetail);
        List<ContractDTO> list = contractService.getAllContractDTO();
        List<DichVuDiKem> dichVuDiKemList = contractService.getAllDichVuDiKem();
        request.setAttribute("list", list);
        request.setAttribute("dichVuDiKemList", dichVuDiKemList);
        if (map.isEmpty()) {
            request.setAttribute("message", "Thêm mới thành công");
        } else {
            request.setAttribute("errors", map);
        }
        try {
            request.getRequestDispatcher("/contract/create-contract-detail.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createContract(HttpServletRequest request, HttpServletResponse response) {
        String ngayLamHopDong = request.getParameter("ngayLamHopDong");
        String ngayKetThuc = request.getParameter("ngayKetThuc");
        String tienDatCoc = request.getParameter("tienDatCoc");
        Integer maNhanVien = Integer.valueOf(request.getParameter("maNhanVien"));
        Integer maKhachHang = Integer.valueOf(request.getParameter("maKhachHang"));
        Integer maDichVu = Integer.valueOf(request.getParameter("maDichVu"));
        Contract contract = new Contract(ngayLamHopDong, ngayKetThuc, tienDatCoc, maNhanVien, maKhachHang, maDichVu);

        Map<String, String> map = contractService.createNewContract(contract);
        if (map.isEmpty()) {
            request.setAttribute("message", "thêm mới thành công");
        } else {
            List<MaNhanVien> maNhanVienList = contractService.getAllMaNhanVien();
            List<MaKhachHang> maKhachHangList = contractService.getAllMaKhachHang();
            List<MaDichVu> maDichVuList = contractService.getAllMaDichVu();

            request.setAttribute("maNhanVienList", maNhanVienList);
            request.setAttribute("maKhachHangList", maKhachHangList);
            request.setAttribute("maDichVuList", maDichVuList);
            request.setAttribute("errors", map);
        }
        try {
            request.getRequestDispatcher("/contract/create-contract.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
