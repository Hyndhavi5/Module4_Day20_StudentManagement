package com.module4;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    Student student = new Student(0, name, email, course, age);
                    studentDAO.addStudent(student);
                    break;

                case 2:
                    List<Student> students = studentDAO.getAllStudents();

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n===== STUDENTS =====");

                        for (Student s : students) {
                            System.out.println(
                                    "ID: " + s.getId()
                                    + " | Name: " + s.getName()
                                    + " | Email: " + s.getEmail()
                                    + " | Course: " + s.getCourse()
                                    + " | Age: " + s.getAge()
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();

                    Student found = studentDAO.findStudentById(searchId);

                    if (found != null) {
                        System.out.println("ID: " + found.getId());
                        System.out.println("Name: " + found.getName());
                        System.out.println("Email: " + found.getEmail());
                        System.out.println("Course: " + found.getCourse());
                        System.out.println("Age: " + found.getAge());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();

                    System.out.print("Enter new course: ");
                    String newCourse = scanner.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();

                    Student updatedStudent =
                            new Student(updateId, newName, newEmail, newCourse, newAge);

                    studentDAO.updateStudent(updatedStudent);
                    break;

                case 5:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    studentDAO.deleteStudent(deleteId);
                    break;

                case 6:
                    System.out.println("Thank you for using Student Management System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}