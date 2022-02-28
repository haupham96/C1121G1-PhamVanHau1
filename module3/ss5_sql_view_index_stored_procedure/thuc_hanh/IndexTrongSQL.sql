use classicmodels;

alter table customers
add index idx_customer(customername);

explain select * from customers
where customername ='Land of Toys Inc.';

alter table customers
add index  idx_full_name(contactFirstname,contactLastname);

EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';

alter table customers
drop index idx_full_name;