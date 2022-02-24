use quanlysinhvien;
select * from student;
select * from student 
where status = 1;

SELECT * FROM quanlysinhvien.subject
where credit<10;

select s.studentid,s.studentname,c.classname
from student s join class c on s.classid=c.classid;

select s.studentid,s.studentname,c.classname
from student s join class c where c.ClassName='a1';

select s.studentid,s.studentname,sub.subname,m.mark
from student s join mark m 
on s.studentid=m.studentid 
join `subject` sub on sub.SubId=m.SubId
where sub.subname='cf';