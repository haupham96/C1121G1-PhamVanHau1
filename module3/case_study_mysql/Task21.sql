use furama ;

create view v_nhan_vien as
select nhan_vien.ma_nhan_vien , nhan_vien.ho_ten , nhan_vien.dia_chi , hop_dong.ma_hop_dong , hop_dong.ngay_lam_hop_dong
from nhan_vien 
join hop_dong on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien 
where nhan_vien.dia_chi like '%Đà Nẵng' 
and hop_dong.ngay_lam_hop_dong like '2021-04-25%'
group by hop_dong.ma_nhan_vien ;

select * from v_nhan_vien;





