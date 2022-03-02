use furama;

select dich_vu_di_kem.ma_dich_vu_di_kem , dich_vu_di_kem.ten_dich_vu_di_kem , sum(ifnull(hop_dong_chi_tiet.so_luong,0)) as so_luong_dich_vu_di_kem
from dich_vu_di_kem 
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem 
group by hop_dong_chi_tiet.ma_dich_vu_di_kem
having sum(ifnull(hop_dong_chi_tiet.so_luong,0)) >= all (select sum(ifnull(hop_dong_chi_tiet.so_luong,0)) from hop_dong_chi_tiet group by hop_dong_chi_tiet.ma_dich_vu_di_kem);