use furama;
select khach_hang.ma_khach_hang , khach_hang.ho_ten , loai_khach.ten_loai_khach , hop_dong.ma_hop_dong , dich_vu.ten_dich_vu , hop_dong.ngay_lam_hop_dong , hop_dong.ngay_ket_thuc , 
(ifnull(dich_vu.chi_phi_thue,0) + sum(ifnull(hop_dong_chi_tiet.so_luong,0) * ifnull(dich_vu_di_kem.gia,0))) as 'Tổng Tiền'
from loai_khach right join khach_hang on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
left join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
left join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
left join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
left join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
group by hop_dong.ma_hop_dong 
order by khach_hang.ma_khach_hang;

