package service;

import model.HocSinh;
import model.Sach;
import model.TheMuonSach;
import model.ThongTinMuonSach;

import java.util.List;

public interface ISachService {

    List<Sach> getAllSach();

    Sach findSachById(Integer bookId);

    List<HocSinh> getAllHocSinh();

    void editAmuont(Sach sach);

    void addTheMuonSach(TheMuonSach theMuonSach);

    List<ThongTinMuonSach> getAllThongTinMuonSach();

    boolean traSach(String code , Sach sach);

    Sach findBookById(Integer bookId);

    List<Sach> findBookByName(String searchName);
}
