
create database erd_eer;
use erd_eer;

create table nha_cung_cap(
ma_nha_cung_cap int auto_increment,
ten_nha_cung_cap varchar(100),
dia_chi varchar(100),
ma_sdt int ,
primary key (ma_nha_cung_cap)
);
create table don_dat_hang(
so_don_hang int auto_increment,
ngay_dat_hang date,
ma_nha_cung_cap int,
primary key(so_don_hang),
foreign key(ma_nha_cung_cap)references nha_cung_cap(ma_nha_cung_cap)
);
create table sdt(
ma_sdt int auto_increment,
sdt varchar(20),
ma_nha_cung_cap int,
primary key (ma_sdt),
foreign key (ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);


create table vat_tu(
ma_vat_tu int auto_increment,
ten_vat_tu varchar(100),
primary key(ma_vat_tu)
);
create table dondathang_vattu(
ma_vat_tu int ,
so_don_hang int ,
primary key (ma_vat_tu,so_don_hang),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_don_hang) references don_dat_hang(so_don_hang)
);
create table phieu_nhap(
so_phieu_nhap int auto_increment,
ngay_nhap date,
primary key(so_phieu_nhap)
);
create table vattu_phieunhap(
so_phieu_nhap int ,
ma_vat_tu int ,
don_gia_nhap int not null,
so_luong_nhap int not null,
primary key(so_phieu_nhap,ma_vat_tu),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_phieu_nhap) references phieu_nhap(so_phieu_nhap)
);
create table phieu_xuat(
so_phieu_xuat int auto_increment,
ngay_xuat date,
primary key(so_phieu_xuat)
);
create table vattu_phieuxuat(
so_phieu_xuat int,
ma_vat_tu int,
don_gia_xuat int not null,
so_luong_xuat int not null,
primary key (so_phieu_xuat,ma_vat_tu),
foreign key(so_phieu_xuat)references phieu_xuat(so_phieu_xuat),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);





