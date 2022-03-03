use furama;

select nhan_vien.ma_nhan_vien , nhan_vien.ho_ten 
from nhan_vien
left join hop_dong on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
left join trinh_do on trinh_do.ma_trinh_do = nhan_vien.ma_trinh_do
left join bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan
where nhan_vien.ma_nhan_vien not in ( select hop_dong.ma_nhan_vien from hop_dong where year(hop_dong.ngay_lam_hop_dong) between 2019 and 2021 )
group by nhan_vien.ma_nhan_vien
having count(hop_dong.ma_nhan_vien) =0
 ;