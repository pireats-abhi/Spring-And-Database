# Spring-And-Database
This project is only for configuration to how we connect MySQL with our Spring MVC project.

# Database
create database demo1;

use demo1;

CREATE TABLE student(
   id INT AUTO_INCREMENT,
   name VARCHAR(100),
   email VARCHAR(100),
   age int(50),
   sex VARCHAR(20),
   PRIMARY KEY(id)
);
