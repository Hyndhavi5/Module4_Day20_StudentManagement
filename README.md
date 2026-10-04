# Module 4 – Java + MySQL Student Management System

## Project Overview

A Java CLI-based Student Management System developed using JDBC and MySQL.

This project demonstrates database connectivity, SQL operations, JDBC architecture, PreparedStatement usage, CRUD operations, and transaction handling.

## Technologies Used

- Java
- JDBC
- MySQL
- Maven
- MySQL Connector/J
- GitHub

## Features

- Add Student
- View All Students
- Search Student by ID
- Update Student
- Delete Student
- MySQL database integration
- PreparedStatement for secure SQL execution
- Transaction handling with commit and rollback

## Database

Database name:

`student_management`

Table:

`students`

## Project Structure

```text
src/main/java/com/module4/
├── Main.java
├── Student.java
├── StudentDAO.java
└── DBConnection.java
## How to Run

1. Create the `student_management` database in MySQL.
2. Create the `students` table.
3. Configure the MySQL username and password in `DBConnection.java`.
4. Build the project using Maven:

```text
mvn clean package
5. Run the application:

```text
mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java "-Dexec.mainClass=com.module4.Main"
## Learning Outcomes

- Understanding JDBC architecture
- Connecting Java applications to MySQL
- Executing SQL using PreparedStatement
- Performing CRUD operations
- Handling database transactions
- Building a real-world Java database application
