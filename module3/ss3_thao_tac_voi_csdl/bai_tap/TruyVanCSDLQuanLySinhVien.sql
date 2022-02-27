use quan_ly_sinh_vien;

-- Hiển thị tất cả các sinh viên có tên bắt đầu = ký tự ‘h’

select student_name from student 
where student_name like 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.

select * from class 
where start_date like '_____12%';

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.

select * from `subject` 
where credit between 3 and 5 ;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
set sql_safe_updates = 0;
update student 
set class_id = 2 
where student_name ='Hung';
set sql_safe_updates = 1;

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
SELECT s.Student_Name , sub.sub_name , m.mark
FROM student s join mark m on s.Student_Id=m.Student_Id
join `subject` sub on sub.sub_id=m.Sub_Id 
order by m.Mark desc , s.student_name asc;
