use furama;
select khach_hang.ho_ten ,loai_khach.ten_loai_khach as 'Customer Class' , count(hop_dong.ma_khach_hang) as 'số lần đặt phòng'
from khach_hang inner join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
inner join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
where loai_khach.ten_loai_khach = 'Diamond'
group by hop_dong.ma_khach_hang 
order by count(hop_dong.ma_khach_hang) ;
