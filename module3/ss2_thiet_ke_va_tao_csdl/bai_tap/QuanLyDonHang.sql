create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table customer(
customer_id int auto_increment,
customer_name varchar(100),
customer_age int,
primary key (customer_id)
);
create table `order`(
order_id int auto_increment,
customer_id int,
order_date date,
order_price int,
primary key (order_id)
);
alter table `order` add foreign key(customer_id) references customer(customer_id);
create table product(
product_id int auto_increment,
product_name varchar(100),
poduct_price int,
primary key (product_id)
);
create table order_detail(
order_id int,
product_id int,
order_quanlity int,
primary key(order_id,product_id),
foreign key(order_id) references `order`(order_id),
foreign key(product_id) references product(product_id)
);