create database Employee;
create  table empl (
	empno int,
    ename varchar(25),
    job varchar(25),
    mgr int,
    hiredate date,
    sal decimal(6,2),
    comm decimal(6,2),
    deptno int);
insert into empl values 
		(8369,'SMITH','CLERK',8902,'1990-12-18',800.00,null,20),
		(8499,'ANYA','SALESMAN',8698,'1991-02-20',1600.00,300.00,30),
        (8521,'SETH','SALESMAN',8698,'1991-02-22',1250.00,500.00,30),
        (8566,'MAHADEVAN','MANAGER',8839,'1991-04-02',2985.00,null,20),
        (8654,'MOMIN','SALESMAN',8698,'1991-09-28',1250.00,1400.00,30),
        (8698,'BINA','MANAGER',8839,'1991-05-01',2850.00,null,30),
        (8882,'SHIVANSH','MANAGER',8839,'1991-06-09',2450.00,null,10),
        (8888,'SCOTT','ANALYST',8566,'1992-12-09',3000.00,null,20),
        (8839,'AMIR','PRESIDENT',null,'1991-11-18',5000.00,null,10),
        (8844,'KULDEEP','SALESMAN',8698,'1991-09-08',1500.00,0.00,30);
select * from empl;
select  ename, sal from empl where sal >= 2200.00;
select * from empl where comm is null;
select ename, sal from empl where sal not between 2500 and 4000;
select ename, job, sal from empl where mgr is null;
select ename from empl where ename like '__a%';
select ename from empl where ename like '%t';
