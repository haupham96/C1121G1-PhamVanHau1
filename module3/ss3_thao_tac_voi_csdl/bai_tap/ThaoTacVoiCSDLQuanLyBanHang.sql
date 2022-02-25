use quan_ly_ban_hang;
select * from customer;
insert into customer(customer_name,customer_age)
values('Minh Quan',10),('Ngoc Oanh',20),('Hong Ha',50);

select * from `order`;
insert into `order`(customer_id,order_date)
values(1,'2006-3-21'),(2,'2006-3-23'),(1,'2006-3-16');

select * from product;
insert into product(product_name,poduct_price)
values
('May Giat',3),
('Tu Lanh',5),
('Dieu Hoa',7),
('Quat',1),
('Bep Dien',2);

alter table product change `product_price` `product_price` int;

select * from order_detail;
insert into order_detail(order_id,product_id,order_quanlity)
values(1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3); 

select customer.customer_name,product.product_name from customer
join `order` on `order`.customer_id=customer.customer_id
join order_detail on order_detail.order_id = `order`.order_id
join product on product.product_id=order_detail.product_id;

select customer.customer_name,product.product_name from customer
join `order` on `order`.customer_id=customer.customer_id
join order_detail on order_detail.order_id = `order`.order_id
join product on product.product_id=order_detail.product_id 
where order_detail.order_quanlity < 1;

-- sum(product.product_price*order_detail.order_quanlity) as totalPrice;
select `order`.order_id , `order`.order_date,order_detail.order_quanlity ,sum(product.product_price*order_detail.order_quanlity) as totalPrice from `order`
join order_detail on `order`.order_id=order_detail.order_id
join product on product.product_id=order_detail.product_id
group by `order`.order_id;




