#Data Base
#-----------------------
#create
#2.drop
#3.show
create database tharun_db;
create database deepika_db;
drop database tharun_db;
show databases;


##tables
#-----------------------
#1.create table
#2. select
#3. insert
#4. update
#5. delete
#6. trunate
# drop
#8. ALTER
create table tharun_db.stundent_info
(
id int not null,
name varchar(30),
course varchar(30),
primary key(id)
);

select * from tharun_db.stundent_info;
select name,id from tharun_db.stundent_info;

#insert
insert into tharun_db.stundent_info(id,name,course) values(1,'tharun','full stack');
insert into tharun_db.stundent_info(id,name,course) values(2,'deepika','core java');
insert into tharun_db.stundent_info(id,name) values(3,'girish');
insert into tharun_db.stundent_info(id,name,course) values(4,'navneetha','fullsatck');
insert into tharun_db.stundent_info(id,course) values(5,'fullsatck');
insert into tharun_db.stundent_info(id,name,course) values(6,'girish','corejava');

#Update
UPDATE tharun_db.stundent_info SET course='fullstack' where id = 4;
UPDATE tharun_db.stundent_info SET name='gowthami' where id = 5;

select * from tharun_db.stundent_info;

#delete
DELETE from tharun_db.stundent_info where id = 3;
DELETE FROM tharun_db.stundent_info where id = 5;
#truncate
truncate table tharun_db.stundent_info;
#drop
drop table tharun_db.stundent_info;


#ALTER
#ALTER Table tharun_db.stundent_info alter email_id VARCHAR (50);
ALTER table tharun_db.stundent_info modify COLUMN column_name varchar (50);
ALTER TABLE tharun_db.stundent_info  ADD email_id varchar(40) ;
#need to check 
ALTER TABLE tharun_db.stundent_info  ADD name varchar(40) ;

#MYSQL Clauses
#1.where
#2 distinct
#3.order by
#4.
# 1) where
select * from tharun_db.stundent_info where course='fullsatck';
select * from tharun_db.stundent_info where name=? and name=?;
select * from tharun_db.stundent_info where name=? and name=?;


select * from tharun_db.stundent_info where name in ('navneetha','tharun','deepika') and course='fullstack';


#distinct - used to remove duplicate values
select distinct(name) from tharun_db.stundent_info;

select name from tharun_db.stundent_info;

# order by - sorting
select * from tharun_db.stundent_info order by name asc;
select * from tharun_db.stundent_info order by course asc;
select * from tharun_db.stundent_info where course='fullstack'  order by name desc;








## create another data base for having and aggregate functions demo >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
create table tharun_db.stundent_info2
(
id int not null,
name varchar(30),
course varchar(30),
marks int,
branch varchar(30),
primary key(id)
);


select * from tharun_db.stundent_info;
select name,id from tharun_db.stundent_info;
#insert
insert into tharun_db.stundent_info1(id,name,course,marks,branch) values(1,'tharun','full stack',80,'cse');
insert into tharun_db.stundent_info1(id,name,course,marks,branch) values(2,'deepika','core java',60,'ece');
insert into tharun_db.stundent_info1(id,name,course,marks,branch) values(3,'girish','core java',30,'mech');
insert into tharun_db.stundent_info1(id,name,course,marks,branch) values(4,'navneetha','fullsatck',70,'ece');
insert into tharun_db.stundent_info1(id,name,course,marks,branch) values(5,'bhagvath','fullsatck',10,'civil');
insert into tharun_db.stundent_info1(id,name,course,marks,branch) values(6,'gowthami','fullsatck',90,'ece');
insert into tharun_db.stundent_info(id,name) values(7,'abc');
insert into tharun_db.stundent_info1(id,name,course,marks,branch) values(12,'vijaya','core java',30,'mech'),(13,'shivam','core java',30,'mech');

select * from tharun_db.stundent_info1;


#Aggregate Funcctions
#1. count
#2. sum
#3. Average
#4. Maximum
#5. Minimum

#1) count
select count(*) from tharun_db.stundent_info1;

#2)Sum
select sum(id) from tharun_db.stundent_info1;

#3)Avg
select avg(marks) from tharun_db.stundent_info1;

#4)max
select max(marks) from tharun_db.stundent_info1;

#4)min
select min(marks) from tharun_db.stundent_info1;

#interview question
# Q1 find 3rd highest marks for students

#limit and offset
#limit -> displays the specified number of rows in output
# offset --> skip

select marks from tharun_db.stundent_info1 order by marks desc limit 1 offset 1;
select marks from tharun_db.stundent_info1 order by marks desc limit 1 offset 2;


#Interview Question2 - display sum of marks for each branch where sum of marks should be grater than 60;
select branch,sum(marks) from tharun_db.stundent_info1 group by branch having sum(marks)>60;


#MYSQL Conditions
##################################
#1)AND
#2)OR
#3)Like - %,_
#4)IS NULL
#5)IS NOT NULL
#6)BETWEEN

#1)AND 
#course - fullstack and marks>50
select * from tharun_db.stundent_info1 where course = 'fullsatck' and marks>50;

#2) OR
select * from tharun_db.stundent_info1 where course = 'fullsatck' or marks>50;

#3)LIke
select * from tharun_db.stundent_info1 where name like '%th';
select * from tharun_db.stundent_info1 where name like 'th%';
select * from tharun_db.stundent_info1 where name like '%ee%';
select * from tharun_db.stundent_info1 where name like 'thar_a';

#4) null
select * from tharun_db.stundent_info where course is null;

#5) not null
select * from tharun_db.stundent_info where course is not null;


#JOINS
#-------------------
create table tharun_db.customers
(
custId int not null,
custName varchar(100),
custAdd varchar(300),
custPhone varchar(10),
primary key(custId)
);


#order
create table tharun_db.orders
(
orderId int not null,
quantity int not null,
price int not null,
custId int not null,
primary key(orderId)
);

#insert data
insert into tharun_db.customers values(1,'tharun','hyd','123456789');
insert into tharun_db.customers values(2,'navneetha','bang','9876543210');

insert into tharun_db.customers values(3,'bhagvath','chennai','111111');
insert into tharun_db.customers values(4,'girish','pune','222222');
insert into tharun_db.customers values(5,'deepika','mumbai','33333');


select * from tharun_db.customers;
insert into tharun_db.orders values(100,2,5000,1);
insert into tharun_db.orders values(101,4,10000,2);
insert into tharun_db.orders values(102,1,200,3);
insert into tharun_db.orders values (103,6,6000,10);
select * from tharun_db.orders;

select custName,customers.custId,orderId 
from tharun_db.customers 
INNER JOIN tharun_db.orders
ON tharun_db.customers.custId = tharun_db.orders.custId;

# select <columnNames> from table1 inner join table2 on table1.commonCoumn = table2.commonColumn;

select custName,customers.custId,orderId 
from tharun_db.customers 
LEFT JOIN tharun_db.orders
ON tharun_db.customers.custId = tharun_db.orders.custId;

select custName,customers.custId,orderId 
from tharun_db.customers 
RIGHT JOIN tharun_db.orders
ON tharun_db.customers.custId = tharun_db.orders.custId;


create table tharun_db.bike(
id int,
color varchar(40),
name varchar(50)
);








