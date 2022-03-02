use furama;

select nhan_vien.ma_nhan_vien , nhan_vien.ho_ten , trinh_do.ten_trinh_do , bo_phan.ten_bo_phan , nhan_vien.so_dien_thoai , nhan_vien.dia_chi
from nhan_vien 
join trinh_do on nhan_vien.ma_trinh_do = trinh_do.ma_trinh_do
join bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan
join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
group by hop_dong.ma_nhan_vien
having count(ifnull(hop_dong.ma_nhan_vien,0)) <=3;
