use furama ;

create temporary table temp_dich_vu_di_kem_tang_gia (
select dich_vu_di_kem.ma_dich_vu_di_kem , dich_vu_di_kem.ten_dich_vu_di_kem , sum(hop_dong_chi_tiet.so_luong) as using_times
from dich_vu_di_kem 
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
where year(hop_dong.ngay_lam_hop_dong) = 2020 
group by hop_dong_chi_tiet.ma_dich_vu_di_kem 
having sum(hop_dong_chi_tiet.so_luong) > 10 );

select * from temp_dich_vu_di_kem_tang_gia;

update dich_vu_di_kem
set gia = gia * 2 
where ma_dich_vu_di_kem in (select temp_dich_vu_di_kem_tang_gia.ma_dich_vu_di_kem from temp_dich_vu_di_kem_tang_gia) ;