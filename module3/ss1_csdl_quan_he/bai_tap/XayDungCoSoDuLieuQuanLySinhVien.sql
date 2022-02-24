
create table class(
id int auto_increment,
`name` varchar(50),
primary key(id)

);

create table teacher(
id int auto_increment,
`name` varchar(50),
age int,
country varchar(55),
primary key(id,name)
);

insert into class values(1,"Hau");
insert into class(`name`) values("abc"),("Xyz"),("hal");

select id,`name` from class;

update class set `name`="aaa" where id=1;

set sql_safe_updates = 0;
delete from class where `name`="aaa";
set sql_safe_updates = 1;



