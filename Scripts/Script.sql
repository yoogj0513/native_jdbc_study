select user(), database();

select deptno, deptname, floor from department;

select * from department;

insert into department values(6, '마케팅', 11);

delete from department where deptno = 6;

update department 
	set deptName = '행정', floor = 6
	where deptno = 6;