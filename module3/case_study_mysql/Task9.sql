use furama ;

SELECT month(ngay_lam_hop_dong) as thang , count(ma_khach_hang) as so_luong_khach_dat FROM furama.hop_dong 
where year(ngay_lam_hop_dong)=2021 
group by month(ngay_lam_hop_dong)
order by thang ;
