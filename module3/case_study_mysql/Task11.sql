use furama ;

select dich_vu_di_kem.ma_dich_vu_di_kem , dich_vu_di_kem.ten_dich_vu_di_kem 
from dich_vu_di_kem join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
join khach_hang on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
join loai_khach on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
where (khach_hang.dia_chi like '%Vinh' or khach_hang.dia_chi like '%Quảng Ngãi') and loai_khach.ten_loai_khach ='Diamond';