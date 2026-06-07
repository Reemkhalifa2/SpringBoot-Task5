package com.example.Task5Demo;

public class StudentDemo {
    public static void main(String[] args) {
        System.out.println(update());
    }
    public static Student update() {
        Student student = new Student(101, "Ahmed", "A");
        System.out.println("Current name: " + student.getName());
        student.setName("Ali");
        System.out.println(student.getName());
        return student;
    }
}
