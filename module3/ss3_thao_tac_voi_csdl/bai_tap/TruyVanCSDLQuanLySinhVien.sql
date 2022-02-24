SELECT s.StudentName , sub.subname , m.mark
FROM student s join mark m on s.StudentId=m.StudentId
join `subject` sub on sub.subid=m.SubId 
order by m.Mark desc , s.studentname asc;
;