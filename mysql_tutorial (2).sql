##create database
create database test_databasee;

drop database testdb;

##create table
CREATE TABLE `demo`.`student_det` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `age` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

##insert
INSERT INTO demo.student_det (id,name,age,address) values (1,'bhagvath',24,'bangalore');
INSERT INTO demo.student_det (id,name,age,address) values (2,'tharun',25,'hyd');
INSERT INTO demo.student_det (id,name,age,address) values (10,'thiru',25,'hyd');
INSERT INTO demo.student_det (id,name,age,address) values (3,'tharun',26,'chennai');
INSERT INTO demo.student_det (id,name,age,address) values (4,'kishore',25,'pune');
INSERT INTO demo.student_det (id,name,age,address) values (7,'bhagvath',25,'kerala');
INSERT INTO demo.student_det (id,name,age,address) values (8,'navne',24,'bangalore');
INSERT INTO demo.student_det (id,name,age,address) values (9,'bhargav',24,'bangalore');

##UPDATE
UPDATE demo.student_det  SET email_id = 'bhagvat@gmail.com' WHERE id = 1; 
UPDATE demo.student_det  SET email_id = 'tharun@gmail.com' WHERE id = 2; 
UPDATE demo.student_det  SET email_id = NULL WHERE id = 2;
UPDATE demo.student_det  SET address = 'bangalore' WHERE id = 5;

##DELETE ROW
DELETE from demo.student_det where id=3;

##view all data in that table
select * from demo.student_det order by name desc;

##remove all the data from table
truncate table demo.student_det;

#delete table
drop table demo.student_det;

##Add new column in a table
ALTER TABLE demo.student_det  ADD email_id varchar(40) ;

#show all the tables created
show tables;

#where 
select * from demo.student_det where age=25 ;

#distinct
select distinct name from demo.student_det;
select distinct age from demo.student_det;

#order by
select * from demo.student_det order by name asc;
select * from demo.student_det order by name desc;

#group by
select address,count(name)  from demo.student_det group by address;

#MYSQL indexes
#create index
create index invisible_name_index on demo.student_det(name);
create index test_index on demo.student_det(address);

select * from demo.student_det where name='bhagvath';
explain select * from demo.student_det where name='bhagvath';

select name,address from demo.student_det where address='hyd';
Explain select name,address from demo.student_det where address='hyd';

#show index
SHOW INDEXES FROM demo.student_det;

#Drop index
drop INDEX invisible_name_index ON demo.student_det;
#Drop index alogorithms -> INPLACE & COPY

#MYSQL Conditions
#1)AND
#2)OR
#3)AND OR
#5)Like - %, _
#6)IN

#8)Exists
#10)Not Equal

#9)NOT
#11)IS NULL
#12)IS NOT NULL
#13)BETWEEN

#AND
select * from demo.student_det where name = 'bhagvath' and address='bangalore';

#OR
select * from demo.student_det where name = 'bhagvath' or address='bangalore';


#1)AND
select name,address from demo.student_det where address='hyd' and name='tharun';

#2) OR
select name,address from demo.student_det where address='kerala' or name='tharun';

select * from demo.student_det;
#3)AND OR
select * from demo.student_det where (address='hyd' and name='tharun') or address='kerala';

#4) LIKE -> % and _
#name starting with th
select * from demo.student_det where name LIKE 'th%';
#name ending with th
select * from demo.student_det where name LIKE '%th';
#name contains agv
select * from demo.student_det where name LIKE '%agv%';
select * from demo.student_det where name LIKE 'th_ru%';

#NOT LIKE
select name,address from demo.student_det where name NOT LIKE 'th_run';
#IN
select name,address from demo.student_det where name IN ('tharun','bhagvath');

select * from demo.student_det where name IN ('tharun','bhagvath'); 

#NOT
select * from demo.student_det where name NOT IN ('tharun','bhagvath');

#IS NULL
select * from demo.student_det where email_id is  null;


#IS NOT NULL
select * from demo.student_det where email_id is not null;
select * from demo.student_det;
#BETWEEN -> inclusive
select * from demo.student_det where id BETWEEN 2 and 6;

#exists
CREATE TABLE demo.customer(  
  cust_id int NOT NULL,  
  name varchar(35),  
  occupation varchar(25),  
  age int  
);

CREATE TABLE demo.orders (  
    order_id int NOT NULL,   
    cust_id int,   
    prod_name varchar(45),  
    order_date date  
);

INSERT INTO demo.customer(cust_id, name, occupation, age)   
VALUES (1, 'tharun', 'Engineer', 24),  
(2, 'bhagvat', 'Developer', 25),  
(3, 'Navnitha', 'Leader', 23),  
(4, 'Gowthami', 'Scientist', 23),  
(5, 'deepika', 'Carpenter', 22);

INSERT INTO demo.orders (order_id, cust_id, prod_name, order_date)   
VALUES (123, '1', 'Laptop', '2020-01-10'),  
(124, '2', 'Desktop', '2020-02-12'),  
(125, '3', 'Iphone', '2020-02-15'),  
(126, '4', 'Mobile', '2020-03-05'),  
(127, '5', 'TV', '2020-03-20'); 

#Exists
 SELECT name, occupation FROM demo.customer  
WHERE EXISTS (SELECT * FROM demo.Orders   
WHERE demo.customer.cust_id = 1); 


#MYSQL Joins

#INNER JOIN
#LEFT JOIN
#RIGHT JOIN
#FULL JOIN (my sql doesn't support full join)


ORDER
------------
orderId
customerId
price
quantity

Customer
------------
customerId
customerName
address
NUMBER



CREATE TABLE demo.StudentInfo
(
StudentID int,
StudentName varchar(8000),
PhoneNumber int,
City varchar(8000)
);

CREATE TABLE demo.Subject
(
subject_id int,
subject_name varchar(8000),
StudentID int
);

select * from demo.studentinfo;
select * from demo.subject;



insert into demo.StudentInfo(StudentID,StudentName,PhoneNumber,City) values(1,'sai',88863,'gorantla');
insert into demo.StudentInfo(StudentID,StudentName,PhoneNumber,City) values(2,'hemanth',9669163,'rajahmundry');
insert into demo.StudentInfo(StudentID,StudentName,PhoneNumber,City) values(3,'anirudh',81442,'hyderabad');

insert into demo.Subject(subject_id,subject_name,StudentID) values(100,'physics',1);
insert into demo.Subject(subject_id,subject_name,StudentID) values(101,'maths',2);


select * from demo.studentinfo; 

select * from demo.subject; 




#Inner Join


SELECT demo.Subject.subject_name, demo.studentinfo.StudentName
FROM demo.Subject
INNER JOIN demo.StudentInfo ON demo.subject.StudentID = demo.studentinfo.StudentID;

#Left join
SELECT demo.StudentInfo.StudentName, demo.subject.subject_name
FROM demo.StudentInfo
LEFT JOIN demo.subject ON demo.StudentInfo.StudentID = demo.subject.StudentID;

#right join
SELECT demo.StudentInfo.StudentName, demo.subject.subject_name
FROM demo.StudentInfo
right JOIN demo.subject ON demo.StudentInfo.StudentID = demo.subject.StudentID;


















 



















show tables;




