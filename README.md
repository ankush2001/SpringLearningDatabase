CustomerCurdApp - Spring Boot Microservice with PostgreSQL

Description:
-------------
This is a simple Spring Boot-based microservice for performing CRUD (Create, Read, Update, Delete) operations on customer data. It connects to a PostgreSQL database and exposes RESTful APIs.

Tech Stack:
-----------
- Java 17
- Spring Boot 3.5.3
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

Project Structure:
------------------
- model/Customer.java       --> Entity class mapped to PostgreSQL table
- repository/CustomerRepository.java  --> JPA Repository interface
- controller/CustomerController.java  --> REST controller exposing CRUD APIs
- application.properties    --> PostgreSQL and JPA config
- pom.xml                   --> Project dependencies

Database Configuration:
-----------------------
Ensure PostgreSQL is running and a database named `customerdb` is created.

