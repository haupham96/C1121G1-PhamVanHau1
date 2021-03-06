use furama;

select hop_dong.ma_hop_dong , loai_dich_vu.ten_loai_dich_vu ,dich_vu_di_kem.ten_dich_vu_di_kem, count(ifnull(hop_dong_chi_tiet.ma_dich_vu_di_kem,0)) as so_lan_su_dung
from dich_vu_di_kem 
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
join loai_dich_vu on loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu 
group by hop_dong_chi_tiet.ma_dich_vu_di_kem
having count(ifnull(hop_dong_chi_tiet.ma_dich_vu_di_kem,0)) = 1
order by hop_dong_chi_tiet.ma_hop_dong ;