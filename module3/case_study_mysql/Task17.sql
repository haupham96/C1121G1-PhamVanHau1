use furama ;

create view update_customer_class_view as 
select  loai_khach.ma_loai_khach , loai_khach.ten_loai_khach , khach_hang.ma_khach_hang , khach_hang.ho_ten , sum(dich_vu.chi_phi_thue + (hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia)) , hop_dong.ngay_lam_hop_dong
from loai_dich_vu 
join dich_vu on loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
join hop_dong on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
join  hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
join khach_hang on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
join loai_khach on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
where year(hop_dong.ngay_lam_hop_dong) = 2021 and loai_khach.ten_loai_khach ='Platinum'
group by khach_hang.ma_khach_hang ;

select * from update_customer_class_view ;

update khach_hang 
set khach_hang.ma_loai_khach = 1
where khach_hang.ma_khach_hang in (select update_customer_class_view.ma_khach_hang from update_customer_class_view  ) ;