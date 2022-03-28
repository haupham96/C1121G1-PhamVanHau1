package repository.impl;

import model.HocSinh;
import model.Sach;
import model.TheMuonSach;
import model.ThongTinMuonSach;
import repository.DatabaseConnection;
import repository.ISachRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SachRepository implements ISachRepository {
    DatabaseConnection connectDatabase = new DatabaseConnection();
    private static final String SELECT_ALL_SACH = "SELECT * FROM my_database.book ";
    private static final String FIND_BOOK_BY_ID = "SELECT * FROM my_database.book where book_id = ? ;";
    private static final String SELECT_ALL_HOC_SINH = "SELECT * FROM my_database.student;";
    private static final String EDIT_AMOUNT = "update book set amount = ? where book_id = ? ;";
    private static final String ADD_THE_MUON_SACH = "insert into borrow_card (borrow_code,book_id,student_id,borrow_date,return_date) values(?,?,?,?,?);";
    private static final String THONG_TIN_MUON_SACH = "select borrow_card.borrow_code , book.book_name , student.student_name , student.class , borrow_card.borrow_date , borrow_card.return_date , book.book_id\n" +
            "from book join borrow_card on book.book_id = borrow_card.book_id\n" +
            "join student on student.student_id = borrow_card.student_id ;";
    private static final String TRA_SACH = "{ call delete_borrow_card(?) }";
    private static final String THEM_SACH_VAO_THU_VIEN = "update book set amount = ? where book_id = ? ;";

    @Override
    public List<Sach> getAllSach() {
        List<Sach> list = new ArrayList<>();
        try (Connection connection = connectDatabase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SACH);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Sach sach = new Sach();
                sach.setBookId(rs.getInt(1));
                sach.setBookCode(rs.getString(2));
                sach.setBookName(rs.getString(3));
                sach.setBookAuthor(rs.getString(4));
                sach.setBookAmount(rs.getString(5));
                sach.setBookDescription(rs.getString(6));

                list.add(sach);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Sach findSachById(Integer bookId) {
        Sach sach = null;
        try (Connection connection = connectDatabase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_BOOK_BY_ID);) {
            preparedStatement.setInt(1, bookId);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                sach = new Sach();
                sach.setBookId(rs.getInt(1));
                sach.setBookCode(rs.getString(2));
                sach.setBookName(rs.getString(3));
                sach.setBookAuthor(rs.getString(4));
                sach.setBookAmount(rs.getString(5));
                sach.setBookDescription(rs.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sach;
    }

    @Override
    public List<HocSinh> getAllHocSinh() {
        List<HocSinh> list = new ArrayList<>();
        try (Connection connection = connectDatabase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_HOC_SINH);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                HocSinh hocSinh = new HocSinh();
                hocSinh.setStudentId(rs.getInt(1));
                hocSinh.setStudentName(rs.getString(2));
                hocSinh.setStudentClass(rs.getString(3));
                list.add(hocSinh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void editAmuont(Sach sach) {
        try (Connection connection = connectDatabase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(EDIT_AMOUNT);) {
            preparedStatement.setString(1, sach.getBookAmount());
            preparedStatement.setInt(2, sach.getBookId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addTheMuonSach(TheMuonSach theMuonSach) {
        try (Connection connection = connectDatabase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ADD_THE_MUON_SACH);) {
            preparedStatement.setString(1, theMuonSach.getMaMuonSach());
            preparedStatement.setInt(2, theMuonSach.getBooId());
            preparedStatement.setInt(3, theMuonSach.getStudentId());
            preparedStatement.setString(4, theMuonSach.getBorrowDate());
            preparedStatement.setString(5, theMuonSach.getReturnDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ThongTinMuonSach> getAllThongTinMuonSach() {
        List<ThongTinMuonSach> list = new ArrayList<>();
        try (Connection connection = connectDatabase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(THONG_TIN_MUON_SACH);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinMuonSach thongTinMuonSach = new ThongTinMuonSach();
                thongTinMuonSach.setMaMuonSach(rs.getString(1));
                thongTinMuonSach.setBookName(rs.getString(2));
                thongTinMuonSach.setStudentName(rs.getString(3));
                thongTinMuonSach.setStudentClass(rs.getString(4));
                thongTinMuonSach.setBorrowDate(rs.getString(5));
                thongTinMuonSach.setReturnDate(rs.getString(6));
                thongTinMuonSach.setBookId(rs.getInt(7));
                list.add(thongTinMuonSach);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean traSach(String code, Sach sach) {
        boolean check = false;
        try (Connection connection = connectDatabase.getConnection();
             CallableStatement callableStatement = connection.prepareCall(TRA_SACH);) {
            callableStatement.setString(1, code);
            callableStatement.executeUpdate();
            PreparedStatement preparedStatement = connection.prepareStatement(THEM_SACH_VAO_THU_VIEN);
            preparedStatement.setInt(1, Integer.parseInt(sach.getBookAmount()) + 1);
            preparedStatement.setInt(2, (sach.getBookId()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    @Override
    public Sach findBookById(Integer bookId) {
        Sach sach = null;
        List<Sach> list = this.getAllSach();
        for (Sach ls : list) {
            if (ls.getBookId() == bookId) {
                sach = ls;
            }
        }
        return sach;
    }

    @Override
    public List<Sach> findBookByName(String searchName) {
        List<Sach> listReturn = new ArrayList<>();
        List<Sach> list = this.getAllSach();
        for(Sach ls:list){
            if(ls.getBookName().contains(searchName)){
                listReturn.add(ls);
            }
        }
        return listReturn;
    }
}
