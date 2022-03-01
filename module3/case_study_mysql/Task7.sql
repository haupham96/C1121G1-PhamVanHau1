use furama ;

select dich_vu.ma_dich_vu , dich_vu.ten_dich_vu , dich_vu.dien_tich , dich_vu.so_nguoi_toi_da , dich_vu.chi_phi_thue 
from dich_vu left join hop_dong on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
where (dich_vu.ma_dich_vu in (select hop_dong.ma_dich_vu from hop_dong where year(hop_dong.ngay_lam_hop_dong)=2020)) 
and (dich_vu.ma_dich_vu not in (select hop_dong.ma_dich_vu from hop_dong where year(hop_dong.ngay_lam_hop_dong)=2021))
group by hop_dong.ma_dich_vu;