use classicmodels;

delimiter //
drop procedure if exists get_customer_by_id;
create procedure get_customer_by_id(customer_number int(3))
begin 
select * from customers where customerNumber = customer_number;
end //
delimiter ;

call get_customer_by_id(175);