use furama;

select hop_dong.ma_hop_dong , nhan_vien.ho_ten , khach_hang.ho_ten , khach_hang.so_dien_thoai , dich_vu.ten_dich_vu , sum(ifnull(hop_dong_chi_tiet.so_luong,0)) as so_luong_dich_vu_di_kem  , hop_dong.tien_dat_coc
from dich_vu_di_kem join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
right join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
right join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
right join loai_dich_vu on loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
right join khach_hang on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
right join nhan_vien on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien 
where hop_dong.ma_hop_dong in (select hop_dong.ma_hop_dong from hop_dong where year(hop_dong.ngay_lam_hop_dong)=2020 and month(hop_dong.ngay_lam_hop_dong) between 10 and 12)
and hop_dong.ma_hop_dong not in (select hop_dong.ma_hop_dong from hop_dong where year(hop_dong.ngay_lam_hop_dong)=2021 and month(hop_dong.ngay_lam_hop_dong) between 1 and 6)
group by hop_dong.ma_hop_dong;