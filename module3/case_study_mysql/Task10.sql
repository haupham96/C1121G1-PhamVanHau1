use furama ;

select hop_dong.ma_hop_dong , hop_dong.ngay_lam_hop_dong , hop_dong.ngay_ket_thuc , hop_dong.tien_dat_coc , ifnull(sum( hop_dong_chi_tiet.so_luong),0) as so_luong_dich_vu_di_kem
from hop_dong left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
group by hop_dong.ma_hop_dong;