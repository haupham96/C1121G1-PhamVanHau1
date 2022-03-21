package controller;

import data_transfer_object.NhanVienDTO;
import model.BoPhan;
import model.NhanVien;
import model.TrinhDo;
import model.ViTri;
import service.IEmployeeService;
import service.impl.EmployeeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    IEmployeeService employeeService = new EmployeeService();
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
            case "delete":
//                showDeleteModal(request,response);
                break;
            default:
                listCustomers(request,response);
        }

    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        Integer maNhanVien = Integer.valueOf(request.getParameter("id"));
        NhanVien nhanVien = employeeService.findEmployeeById(maNhanVien);

        List<ViTri> viTriList = employeeService.getAllPosition();
        List<TrinhDo> trinhDoList = employeeService.getAllTrinhDo();
        List<BoPhan> boPhanList = employeeService.getAllBoPhan();

        request.setAttribute("nhanVien",nhanVien);
        request.setAttribute("viTriList",viTriList);
        request.setAttribute("trinhDoList",trinhDoList);
        request.setAttribute("boPhanList",boPhanList);
        try {
            request.getRequestDispatcher("/employee/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<ViTri> viTriList = employeeService.getAllPosition();
        List<TrinhDo> trinhDoList = employeeService.getAllTrinhDo();
        List<BoPhan> boPhanList = employeeService.getAllBoPhan();
        request.setAttribute("viTriList",viTriList);
        request.setAttribute("trinhDoList",trinhDoList);
        request.setAttribute("boPhanList",boPhanList);
        try {
            request.getRequestDispatcher("/employee/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<NhanVienDTO> list =  employeeService.getAllEmployee();
        request.setAttribute("list",list);
        try {
            request.getRequestDispatcher("/employee/list.jsp").forward(request,response);
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
                createEmployee(request,response);
                break;
            case "search":
                searchEmployeeByName(request,response);
                break;
            case "edit":
                editEmployee(request,response);
                break;
            case "delete":
//                showDeleteModal(request,response);
                break;
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        Integer maNhanVien = Integer.valueOf(request.getParameter("id"));
        String hoTen = request.getParameter("hoTen") ;
        String ngaySinh = request.getParameter("ngaySinh") ;
        String soCMND = request.getParameter("soCMND");
        String luong = request.getParameter("luong");
        String soDienThoai = request.getParameter("soDienThoai");
        String email = request.getParameter("email");
        String diaChi = request.getParameter("diaChi");
        Integer trinhDo = Integer.valueOf(request.getParameter("trinhDo"));
        Integer viTri = Integer.valueOf(request.getParameter("viTri"));
        Integer boPhan = Integer.valueOf(request.getParameter("boPhan"));
        NhanVien nhanVien = new NhanVien(maNhanVien,hoTen,ngaySinh,soCMND,luong,soDienThoai,email,diaChi,trinhDo,viTri,boPhan);

        Map<String,String> map = employeeService.editEmployee(nhanVien);

        if(map.isEmpty()){
            request.setAttribute("message","Chỉnh sửa thành công");
            try {
                request.getRequestDispatcher("/employee/edit.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            String hoTenNew = request.getParameter("hoTen") ;
            String ngaySinhNew = request.getParameter("ngaySinh") ;
            String soCMNDNew = request.getParameter("soCMND");
            String luongNew = request.getParameter("luong");
            String soDienThoaiNew = request.getParameter("soDienThoai");
            String emailNew = request.getParameter("email");
            String diaChiNew = request.getParameter("diaChi");
            Integer trinhDoNew = Integer.valueOf(request.getParameter("trinhDo"));
            Integer viTriNew = Integer.valueOf(request.getParameter("viTri"));
            Integer boPhanNew = Integer.valueOf(request.getParameter("boPhan"));

            NhanVien nhanVienNew = new NhanVien(maNhanVien,hoTenNew,ngaySinhNew,soCMNDNew,luongNew,soDienThoaiNew,emailNew,diaChiNew,trinhDoNew,viTriNew,boPhanNew);

            List<ViTri> viTriList = employeeService.getAllPosition();
            List<TrinhDo> trinhDoList = employeeService.getAllTrinhDo();
            List<BoPhan> boPhanList = employeeService.getAllBoPhan();

            request.setAttribute("errors",map);
            request.setAttribute("nhanVien",nhanVienNew);
            request.setAttribute("viTriList",viTriList);
            request.setAttribute("trinhDoList",trinhDoList);
            request.setAttribute("boPhanList",boPhanList);
            try {
                request.getRequestDispatcher("/employee/edit.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void searchEmployeeByName(HttpServletRequest request, HttpServletResponse response) {
        String searchName = request.getParameter("searchName");
        List<NhanVienDTO> list = employeeService.searchByName(searchName);
        if(list.isEmpty()){
            try {
                request.getRequestDispatcher("/employee/not-found.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            request.setAttribute("list",list);
            try {
                request.getRequestDispatcher("/employee/search.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String hoTen = request.getParameter("hoTen") ;
        String ngaySinh = request.getParameter("ngaySinh") ;
        String soCMND = request.getParameter("soCMND");
        String luong = request.getParameter("luong");
        String soDienThoai = request.getParameter("soDienThoai");
        String email = request.getParameter("email");
        String diaChi = request.getParameter("diaChi");
        Integer trinhDo = Integer.valueOf(request.getParameter("trinhDo"));
        Integer viTri = Integer.valueOf(request.getParameter("viTri"));
        Integer boPhan = Integer.valueOf(request.getParameter("boPhan"));
        NhanVien nhanVien = new NhanVien(hoTen,ngaySinh,soCMND,luong,soDienThoai,email,diaChi,trinhDo,viTri,boPhan);
        Map<String,String> map = employeeService.addNewEmployee(nhanVien);
        if(map.isEmpty()){
            request.setAttribute("message","Thêm mới thành công");
            try {
                request.getRequestDispatcher("/employee/create.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            List<ViTri> viTriList = employeeService.getAllPosition();
            List<TrinhDo> trinhDoList = employeeService.getAllTrinhDo();
            List<BoPhan> boPhanList = employeeService.getAllBoPhan();

            request.setAttribute("errors",map);
            request.setAttribute("viTriList",viTriList);
            request.setAttribute("trinhDoList",trinhDoList);
            request.setAttribute("boPhanList",boPhanList);
            try {
                request.getRequestDispatcher("/employee/create.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
