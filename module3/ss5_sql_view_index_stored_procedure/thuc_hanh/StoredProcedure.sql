use classicmodels;

delimiter //
create procedure find_All_Customer()
begin 
select * from customers ;
end //
delimiter ;

call find_all_customer();

delimiter //
drop procedure if exists find_all_customer  ;
create procedure find_all_customer()
begin 
select * from customers where customernumber = 175;
end
//

call find_all_customer();
