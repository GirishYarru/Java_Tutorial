##create database
create database test_databasee;

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
INSERT INTO demo.student_det (id,name,age,address) values (3,'dummy',25,'hyd');

##UPDATE
UPDATE demo.student_det  SET email_id = 'bhagvat@gmail.com' WHERE id = 1; 
UPDATE demo.student_det  SET email_id = 'tharun@gmail.com' WHERE id = 2; 
UPDATE demo.student_det  SET email_id = NULL WHERE id = 2;

##DELETE ROW
DELETE from demo.student_det where id=3;

##view all data in that table
select * from demo.student_det;

##remove all the data from table
truncate table demo.student_det;

#delete table
drop table demo.student_det;

##Add new column in a table
ALTER TABLE demo.student_det  ADD email_id varchar(40) ;


CREATE TABLE `demo`.`nodes_data` (
  `node_id` INT NOT NULL,
  `label` VARCHAR(100) NOT NULL
  PRIMARY KEY (`node_id`)
  
  );
  
  
  CREATE TABLE `demo`.`nodes_relation_data` (
  `node_id` INT NOT NULL,
  `parent_id` INT NOT NULL
   FOREIGN KEY(`node_id`d) REFERENCES `demo`.`nodes_data`(`node_id`)
  );



