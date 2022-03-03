use furama ;

create temporary table temp (
select khach_hang.ma_khach_hang , khach_hang.ho_ten 
from khach_hang 
join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
where year(hop_dong.ngay_lam_hop_dong) < 2021 ); 

select * from temp ;

set foreign_key_checks = 0 ;
delete from khach_hang
where khach_hang.ma_khach_hang in (select temp.ma_khach_hang from temp ) ;
set foreign_key_checks = 1 ;