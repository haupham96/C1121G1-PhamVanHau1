package controller;

import data_transfer_object.KhachHangDTO;
import model.KhachHang;
import model.LoaiKhach;
import service.IKhachHangService;
import service.impl.KhachHangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet(name = "FuramaServlet", value = {"/customers"})

public class CustomerServlet extends HttpServlet {
    IKhachHangService khachHangService = new KhachHangService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null ){
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            default:
                listCustomers(request,response);
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.valueOf(request.getParameter("id"));
        KhachHang khachHang = khachHangService.findCustomerById(id);
        List<LoaiKhach> loaiKhachList = khachHangService.getAllLoaiKhach();
        request.setAttribute("khachHang",khachHang);
        request.setAttribute("loaiKhachList",loaiKhachList);
        try {
            request.getRequestDispatcher("/customer/edit-customer.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<LoaiKhach> loaiKhachList = khachHangService.getAllLoaiKhach();
        try {
            request.setAttribute("loaiKhachList",loaiKhachList);
            request.getRequestDispatcher("/customer/create-customer.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<KhachHangDTO> khachHangList = khachHangService.getAllCustomerWithCustomerClass();
        request.setAttribute("khacHangList",khachHangList);
        try {
            request.getRequestDispatcher("/customer/list-customer.jsp").forward(request,response);
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
        if(action == null ){
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request,response);
                break;
            case "edit":
                editCustomer(request,response);
                break;
            default:
                listCustomers(request,response);
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String hoTen = request.getParameter("hoTen");
        String ngaySinh = request.getParameter("ngaySinh");
        Integer gioiTinh = Integer.valueOf(request.getParameter("gioiTinh"));
        String soCMND = request.getParameter("soCMND");
        String soDienThoai = request.getParameter("soDienThoai");
        String email = request.getParameter("email");
        String diaChi = request.getParameter("diaChi");
        Integer loaiKhach = Integer.valueOf(request.getParameter("loaiKhach"));

        KhachHang khachHang = new KhachHang(id,hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,loaiKhach,diaChi);

        Map<String,String> map = khachHangService.editCustomer(khachHang);
        if(map.isEmpty()){
            String message = "Thành công";
            request.setAttribute("message",message);
            try {
                request.getRequestDispatcher("/customer/edit-customer.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            List<LoaiKhach> loaiKhachList = khachHangService.getAllLoaiKhach();
            Integer idEdit = Integer.valueOf(request.getParameter("id"));
            String hoTenEdit = request.getParameter("hoTen");
            String ngaySinhEdit = request.getParameter("ngaySinh");
            Integer gioiTinhEdit = Integer.valueOf(request.getParameter("gioiTinh"));
            String soCMNDEdit = request.getParameter("soCMND");
            String soDienThoaiEdit = request.getParameter("soDienThoai");
            String emailEdit = request.getParameter("email");
            String diaChiEdit = request.getParameter("diaChi");
            Integer loaiKhachEdit = Integer.valueOf(request.getParameter("loaiKhach"));

            KhachHang khachHangEdit = new KhachHang(idEdit,hoTenEdit,ngaySinhEdit,gioiTinhEdit,soCMNDEdit,soDienThoaiEdit,emailEdit,loaiKhachEdit,diaChiEdit);
            request.setAttribute("khachHang",khachHangEdit);
            request.setAttribute("loaiKhachList",loaiKhachList);
            request.setAttribute("errors",map);
            try {
                request.getRequestDispatcher("/customer/edit-customer.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {

        String hoTen = request.getParameter("hoTen");
        String ngaySinh = request.getParameter("ngaySinh");
        Integer gioiTinh = Integer.valueOf(request.getParameter("gioiTinh"));
        String soCMND = request.getParameter("soCMND");
        String soDienThoai = request.getParameter("soDienThoai");
        String email = request.getParameter("email");
        String diaChi = request.getParameter("diaChi");
        Integer loaiKhach = Integer.valueOf(request.getParameter("loaiKhach"));
        KhachHang khachHang = new KhachHang(hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,loaiKhach,diaChi);

       Map<String,String> map = khachHangService.addNewCustomer(khachHang);
       if(!map.isEmpty()){
           List<LoaiKhach> loaiKhachList = khachHangService.getAllLoaiKhach();
           request.setAttribute("loaiKhachList",loaiKhachList);
           request.setAttribute("errors",map);
           try {
               request.getRequestDispatcher("/customer/create-customer.jsp").forward(request,response);
           } catch (ServletException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           }
       } else {
            String message = "Thêm mới thành công";
            request.setAttribute("message",message);
           try {
               request.getRequestDispatcher("/customer/create-customer.jsp").forward(request,response);
           } catch (ServletException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
    }
}
