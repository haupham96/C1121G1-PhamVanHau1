use furama;
select * from khach_hang 
where datediff(now(),ngay_sinh)/365 between 18 and 50
and dia_chi like '%Đà Nẵng'
or dia_chi like '%Quảng Trị';