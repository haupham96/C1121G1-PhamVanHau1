SELECT 
    *
FROM
    quanlysinhvien.class;

INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);
SELECT 
    *
FROM
    class;

SELECT 
    *
FROM
    student;
set sql_safe_updates=0;
UPDATE student 
SET 
    phone = '0912113113'
WHERE
    studentname = 'Manh';
set sql_safe_updates=1;

INSERT INTO `Subject`
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
SELECT 
    *
FROM
    `subject`;
SELECT 
    *
FROM
    mark;
