use furama;
select dich_vu.ma_dich_vu , dich_vu.ten_dich_vu , dich_vu.dien_tich , dich_vu.chi_phi_thue , loai_dich_vu.ten_loai_dich_vu 
from dich_vu  left join loai_dich_vu  on loai_dich_vu.ma_loai_dich_vu =  dich_vu.ma_loai_dich_vu
left join hop_dong on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
where dich_vu.ma_dich_vu not in (select hop_dong.ma_dich_vu from hop_dong where year(hop_dong.ngay_lam_hop_dong) = 2021 and month(hop_dong.ngay_lam_hop_dong) between 1 and 3 )
group by hop_dong.ma_dich_vu
order by loai_dich_vu.ten_loai_dich_vu desc
 ;


