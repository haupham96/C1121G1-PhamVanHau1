use quanlysinhvien;

select address,count(studentid) as 'numbers of student' from student
group by student.address;

select student.studentname,avg(mark) as 'average mark' from student
join mark on student.studentid = mark.studentid 
group by student.studentid,student.studentid;

select student.studentname,avg(mark) as average from student
join mark on student.studentid = mark.studentid 
group by student.studentid,student.studentid
having average>15;

select student.studentname,avg(mark) as average from student
join mark on student.studentid = mark.studentid 
group by student.studentid,student.studentid
having average>= all(select avg(mark) from mark group by mark.studentid) ;



