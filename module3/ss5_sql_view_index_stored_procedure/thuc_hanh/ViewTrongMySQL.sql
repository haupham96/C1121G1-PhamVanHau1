use classicmodels ;

create view customer_view as
select  customerNumber, customerName, phone from customers;

select * from customer_view;

create or replace view custonmer_view as
SELECT customerNumber, customerName, contactFirstName, contactLastName, phone

FROM customers

WHERE city = 'Nantes';