create database quan_ly_diem_thi;
use quan_ly_diem_thi;
create table hoc_sinh(
ma_hs varchar(20) primary key,
ten_hs varchar(50),
ngay_sinh datetime ,
lop varchar(20),
gioi_tinh varchar(20) 
);

create table mon_hoc(
ma_monhoc varchar(20) primary key,
ten_monhoc varchar(50)
);

create table bang_diem(
ma_hs varchar(20) ,
ma_monhoc varchar(20) ,
diem_thi int ,
ngay_kiem_tra datetime,
primary key(ma_hs,ma_monhoc),
foreign key(ma_hs) references hoc_sinh(ma_hs),
foreign key(ma_monhoc) references mon_hoc(ma_monhoc)
);

create table giao_vien(
ma_giaovien varchar(20) primary key,
ten_giaovien varchar(20),
sdt varchar(10)
);

alter table mon_hoc add ma_giaovien varchar(20);
alter table mon_hoc add  constraint fk_ma_giaovien foreign key (ma_giaovien) references giao_vien(ma_giaovien);
