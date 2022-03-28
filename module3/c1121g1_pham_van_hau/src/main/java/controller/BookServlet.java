package controller;

import model.HocSinh;
import model.Sach;
import model.TheMuonSach;
import model.ThongTinMuonSach;
import service.ISachService;
import service.impl.SachService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "controller.ProductServlet", value = "/sach")
public class BookServlet extends HttpServlet {
    ISachService sachService = new SachService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "muon-sach":
                formMuonSach(request, response);
                break;
            case "search":
                searchSachByName(request, response);
                break;
            case "the-muon-sach":
                theMuonSach(request, response);
                break;
            default:
                listSach(request, response);
        }
    }

    private void searchSachByName(HttpServletRequest request, HttpServletResponse response) {
       String searchName = request.getParameter("searchName");
       List<Sach> listSach = sachService.findBookByName(searchName);
        request.setAttribute("list", listSach);
        try {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void theMuonSach(HttpServletRequest request, HttpServletResponse response) {
        List<ThongTinMuonSach> list = sachService.getAllThongTinMuonSach();
        request.setAttribute("list", list);
        try {
            request.getRequestDispatcher("/thong-ke.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void formMuonSach(HttpServletRequest request, HttpServletResponse response) {
        Integer bookId = Integer.valueOf(request.getParameter("bookId"));
        Sach sach = sachService.findSachById(bookId);
        List<HocSinh> hocSinhList = sachService.getAllHocSinh();
        LocalDate localDate = LocalDate.now();
        String now = localDate.toString();
        String[] arr = now.split("-");
        String newNow = arr[2] + "/" + arr[1] + "/" + arr[0];
        request.setAttribute("sach", sach);
        request.setAttribute("hocSinhList", hocSinhList);
        request.setAttribute("now", now);
        try {
            request.getRequestDispatcher("/muon-sach.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listSach(HttpServletRequest request, HttpServletResponse response) {
        List<Sach> list = sachService.getAllSach();
        request.setAttribute("list", list);
        try {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
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
            case "muon-sach":
                muonSach(request, response);
                break;
            case "tra-sach":
                traSach(request, response);
                break;
        }
    }

    private void traSach(HttpServletRequest request, HttpServletResponse response) {
        String code = request.getParameter("maMuonSach");
        Integer bookId = Integer.valueOf(request.getParameter("maSach"));
        Sach sach = sachService.findBookById(bookId);
        sachService.traSach(code,sach);
        List<ThongTinMuonSach> list = sachService.getAllThongTinMuonSach();
        request.setAttribute("list", list);
        try {
            request.getRequestDispatcher("/thong-ke.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void muonSach(HttpServletRequest request, HttpServletResponse response) {
        Integer sachId = Integer.valueOf(request.getParameter("sachId"));
        Sach sach = sachService.findSachById(sachId);
        String maMuonSach = request.getParameter("maMuonSach");
        Integer maSach = sach.getBookId();
        Integer maHocSinh = Integer.valueOf(request.getParameter("tenHocSinh"));
        String ngayTra = request.getParameter("ngayTra");
        Integer newAmount = Integer.valueOf(sach.getBookAmount()) - 1;
        sach.setBookAmount(String.valueOf(newAmount));
        sachService.editAmuont(sach);
        LocalDate localDate = LocalDate.now();
        String now = localDate.toString();
        TheMuonSach theMuonSach = new TheMuonSach(maMuonSach, maSach, maHocSinh, now, ngayTra);
        sachService.addTheMuonSach(theMuonSach);
        this.listSach(request, response);
    }
}
