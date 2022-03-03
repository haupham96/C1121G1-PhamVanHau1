use furama ;
select * from v_nhan_vien;
select * from dia_chi ;

set @new_dia_chi = ( select replace((select nhan_vien.dia_chi from nhan_vien where nhan_vien.ma_nhan_vien in (select  v_nhan_vien.ma_nhan_vien from v_nhan_vien)  ),'Yên Bái','Hải Châu') ) ; 

set sql_safe_updates = 0 ;
update nhan_vien 
set nhan_vien.dia_chi = @new_dia_chi
where nhan_vien.ma_nhan_vien in ( select v_nhan_vien.ma_nhan_vien from v_nhan_vien where v_nhan_vien.dia_chi  like '%Yên Bái%') ;
set sql_safe_updates = 1 ;