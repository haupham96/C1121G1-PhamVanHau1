use furama ;
delimiter //
create procedure sp_xoa_khach_hang(in id_xoa int) 

begin 
delete from khach_hang
where khach_hang.ma_khach_hang = id_xoa ;
end //
delimiter ;

set foreign_key_checks = 0 ;
call sp_xoa_khach_hang(1);
set foreign_key_checks = 1 ;

