use furama;
SELECT * FROM furama.nhan_vien
where nhan_vien.ho_ten like 'H%' and char_length(nhan_vien.ho_ten)<=15 
or nhan_vien.ho_ten like 'T%' and char_length(nhan_vien.ho_ten)<=15
or nhan_vien.ho_ten like 'K%' and char_length(nhan_vien.ho_ten)<=15 ;