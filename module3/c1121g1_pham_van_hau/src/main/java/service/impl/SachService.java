package service.impl;

import model.HocSinh;
import model.Sach;
import model.TheMuonSach;
import model.ThongTinMuonSach;
import repository.ISachRepository;
import repository.impl.SachRepository;
import service.ISachService;

import java.util.List;

public class SachService implements ISachService {
    ISachRepository sachRepository = new SachRepository();

    @Override
    public List<Sach> getAllSach() {
        return sachRepository.getAllSach();
    }

    @Override
    public Sach findSachById(Integer bookId) {
        return sachRepository.findSachById(bookId);
    }

    @Override
    public List<HocSinh> getAllHocSinh() {
        return sachRepository.getAllHocSinh();
    }

    @Override
    public void editAmuont(Sach sach) {
        sachRepository.editAmuont(sach);
    }

    @Override
    public void addTheMuonSach(TheMuonSach theMuonSach) {
        sachRepository.addTheMuonSach(theMuonSach);
    }

    @Override
    public List<ThongTinMuonSach> getAllThongTinMuonSach() {
        return sachRepository.getAllThongTinMuonSach();
    }

    @Override
    public boolean traSach(String code , Sach sach) {
        return sachRepository.traSach(code,sach);
    }

    @Override
    public Sach findBookById(Integer bookId) {
        return sachRepository.findBookById(bookId);
    }

    @Override
    public List<Sach> findBookByName(String searchName) {
        return sachRepository.findBookByName(searchName);
    }
}
