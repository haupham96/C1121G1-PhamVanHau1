package controller;

import com.sun.javafx.collections.MappingChange;
import data_transfer_object.FullDichVuDTO;
import model.*;
import service.IDichVuSerVice;
import service.impl.DichVuService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "DichVuServlet", value = "/dichVu")
public class DichVuServlet extends HttpServlet {
    IDichVuSerVice dichVuSerVice = new DichVuService();

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
            default:
                listDichVu(request, response);
        }
    }

    private void listDichVu(HttpServletRequest request, HttpServletResponse response) {
        List<FullDichVuDTO> list = dichVuSerVice.getAllDichVu();
        request.setAttribute("list", list);
        try {
            request.getRequestDispatcher("/dich_vu/list-dichvu.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        Integer code = Integer.valueOf(request.getParameter("code"));
        List<KieuThue> kieuThueList = dichVuSerVice.getAllKieuThue();
        List<LoaiDichVu> loaiDichVuList = dichVuSerVice.getAllLoaiDichVu();
        request.setAttribute("code", code);
        request.setAttribute("kieuThueList", kieuThueList);
        request.setAttribute("loaiDichVuList", loaiDichVuList);
        try {
            request.getRequestDispatcher("/dich_vu/create-dichvu.jsp").forward(request, response);
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
                createDichVu(request, response);
                break;
        }
    }

    private void createDichVu(HttpServletRequest request, HttpServletResponse response) {
        String dichVuCode = request.getParameter("dichVuCode");
        String tenDichVu = request.getParameter("tenDichVu");
        String dienTich = (request.getParameter("dienTich"));
        String chiPhiThue = (request.getParameter("chiPhiThue"));
        String soNguoiToiDa = (request.getParameter("soNguoiToiDa"));
        Integer kieuThue = Integer.valueOf(request.getParameter("kieuThue"));
        Integer loaiDichVu = Integer.valueOf(request.getParameter("loaiDichVu"));
        String tieuChuanPhong = request.getParameter("tieuChuanPhong");
        String moTaTienNghiKhac = request.getParameter("moTaTienNghiKhac");
        String dienTichHoBoi = (request.getParameter("dienTichHoBoi"));
        String soTang = (request.getParameter("soTang"));
        if (loaiDichVu == 1) {
            DichVu villa = new Villa(dichVuCode, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu, tieuChuanPhong, moTaTienNghiKhac, dienTichHoBoi, soTang);
            Map<String, String> map = dichVuSerVice.addNewDichVu(loaiDichVu, villa);
            if (map.isEmpty()) {
                request.setAttribute("message", "Thêm mới thành công");
                try {
                    request.getRequestDispatcher("/dich_vu/create-dichvu.jsp").forward(request, response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                List<KieuThue> kieuThueList = dichVuSerVice.getAllKieuThue();
                List<LoaiDichVu> loaiDichVuList = dichVuSerVice.getAllLoaiDichVu();
                request.setAttribute("code", loaiDichVu);
                request.setAttribute("kieuThueList", kieuThueList);
                request.setAttribute("loaiDichVuList", loaiDichVuList);
                request.setAttribute("map", map);
                try {
                    request.getRequestDispatcher("/dich_vu/create-dichvu.jsp").forward(request, response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        if (loaiDichVu == 2) {
            DichVu house = new House(dichVuCode, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu, tieuChuanPhong, moTaTienNghiKhac, soTang);
            Map<String, String> map = dichVuSerVice.addNewDichVu(loaiDichVu, house);
            if (map.isEmpty()) {
                request.setAttribute("message", "Thêm mới thành công");
                try {
                    request.getRequestDispatcher("/dich_vu/create-dichvu.jsp").forward(request, response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                List<KieuThue> kieuThueList = dichVuSerVice.getAllKieuThue();
                List<LoaiDichVu> loaiDichVuList = dichVuSerVice.getAllLoaiDichVu();
                request.setAttribute("code", loaiDichVu);
                request.setAttribute("kieuThueList", kieuThueList);
                request.setAttribute("loaiDichVuList", loaiDichVuList);
                request.setAttribute("map", map);
                try {
                    request.getRequestDispatcher("/dich_vu/create-dichvu.jsp").forward(request, response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (loaiDichVu == 3) {
            DichVu room = new Room(dichVuCode, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue, loaiDichVu, tieuChuanPhong, moTaTienNghiKhac, "");
            Map<String, String> map = dichVuSerVice.addNewDichVu(loaiDichVu, room);
            if (map.isEmpty()) {
                request.setAttribute("message", "Thêm mới thành công");
                try {
                    request.getRequestDispatcher("/dich_vu/create-dichvu.jsp").forward(request, response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                List<KieuThue> kieuThueList = dichVuSerVice.getAllKieuThue();
                List<LoaiDichVu> loaiDichVuList = dichVuSerVice.getAllLoaiDichVu();
                request.setAttribute("code", loaiDichVu);
                request.setAttribute("kieuThueList", kieuThueList);
                request.setAttribute("loaiDichVuList", loaiDichVuList);
                request.setAttribute("map", map);
                try {
                    request.getRequestDispatcher("/dich_vu/create-dichvu.jsp").forward(request, response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
