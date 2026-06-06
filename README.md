
# SpringBoot-Rest-API

A simple RESTful CRUD API built using Spring Boot, Spring Data JPA, Hibernate, and MySQL.

This project demonstrates basic backend development concepts such as:

* REST APIs
* CRUD Operations
* Spring Boot
* Spring Data JPA
* MySQL Database Integration
* Layered Architecture (Controller, Service, Repository)

---

# Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Lombok
* Maven

---

# Project Structure

```bash
src/main/java
│
├── StudentController
│   └── Controller.java
│
├── StudentModel
│   └── StudenModel.java
│
├── StudentRepository
│   └── StudentRepository.java
│
├── StudentService
│   └── StudentService.java
```

---

# Features

* Add Student
* Fetch All Students
* Fetch Student By ID
* Update Student
* Delete Student

---

# API Endpoints

## 1. Add Student

### Request

```http
POST /student/add
```

### Request Body

```json
{
  "id": 1,
  "name": "John",
  "age": 23,
  "gender:"male"
}
```

---

## 2. Get All Customers

### Request

```http
GET /student
```

---

## 3. Get Customer By ID

### Request

```http
GET /student/{id}
```

### Example

```http
GET /student/1
```

---

## 4. Update Customer

### Request

```http
PUT /student
```

### Request Body

```json
{
  "id": 1,
  "name": "John Updated",
  "age": "23",
  "gender":"male"
}
```

---

## 5. Delete Customer

### Request

```http
DELETE /student/{id}
```

### Example

```http
DELETE /student/1
```

---

# Database Configuration

Configure MySQL database in `application.properties`.

```properties
server.port=9190

spring.application.name=STUDENT-DETAILS

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/students
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# How to Run the Project

## Step 1

Clone the repository

```bash
git clone <repository-url>
```

## Step 2

Open the project in:

* Eclipse
* IntelliJ IDEA
* VS Code

## Step 3

Create MySQL Database

```sql
CREATE DATABASE students;
```

## Step 4

Run the Spring Boot application

---

# Testing APIs

* Postman
* Thunder Client
