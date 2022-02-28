create database demo;

-- Step 1 + 2

use demo;
create table products(
id int auto_increment primary key,
product_code varchar(50),
product_name varchar(50),
product_price varchar(50),
product_amount int ,
product_description varchar(50),
product_status bit(1)
);

insert into products(product_code,product_name,product_price,product_amount,product_description,product_status)
values
('A1','Samsung1','100000',10,'good',1),
('A2','Samsung2','200000',20,'good',1),
('A3','Samsung3','300000',30,'good',1),
('A4','Samsung4','400000',40,'good',1),
('A5','Samsung5','500000',50,'good',1),
('A6','Samsung6','600000',60,'bad',0);

-- step 3

explain select * from products 
where product_Code='A6';

alter table products 
add unique index idx_product_code(product_code);
alter table products
drop index idx_product_code;

alter table products
add index idx_name_price(product_name,product_price);

explain select * from products 
where product_name = 'Samsung2' or product_price='300000';

-- Step 4

Create view product_view as
select product_code , product_name , product_price , product_status 
from products ;

select * from product_view;

create or replace view product_view as
select product_code , product_name , product_price from products
where product_status = 1;

-- Step 5

delimiter //
create procedure get_all_product ()
begin
select * from products ;
end //
delimiter ;

call get_all_product();

delimiter //
create procedure add_new_product(product_code varchar(50),product_name varchar(50),product_price varchar(50),product_amount int,product_description varchar(50),product_status bit(1))
begin
insert into products(product_code,product_name,product_price,product_amount,product_description,product_status)
values
(product_code,product_name,product_price,product_amount,product_description,product_status);
end //
delimiter ;

call add_new_product('A7','Samsung7','700000',70,'ok',1);

delimiter //
create procedure set_product_by_id
(id int ,
 product_code varchar(50),
 product_name varchar(50),
 product_price varchar(50),
 product_amount int,
 product_description varchar(50),
 product_status bit(1))
 begin
 update products
set products.product_code = product_code ,
products.product_name = product_name ,
products.product_price = product_price ,
 products.product_amount = product_amount , 
 products.product_description = product_description ,
 products.product_status = product_status
where products.id = id;
end //
delimiter ;

call set_product_by_id
(1 , 'A9' , 'Samsung9' , '900000' , 90 , 'not good' , 0 );

delimiter //
create procedure delete_product_by_id(id int)
begin
delete from products
where products.id = id;
end //
delimiter ;

call delete_product_by_id(1);
select * from products;

 






