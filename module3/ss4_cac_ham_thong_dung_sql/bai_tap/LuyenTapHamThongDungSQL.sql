use quan_ly_sinh_vien;

SELECT * FROM quan_ly_sinh_vien.subject
where credit>= all(select `subject`.credit from `subject`);

select `subject`.sub_name , mark.mark as max_mark from `subject` 
join mark on mark.sub_id = `subject`.sub_id
having mark.mark = (select max(mark.mark) from mark);

select student.student_id , student.student_name , avg(mark.mark) as avg_mark from student
join mark on mark.student_id = student.student_id
group by student.student_id 
order by avg_mark desc ;
