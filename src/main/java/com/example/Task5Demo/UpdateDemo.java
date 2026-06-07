package com.example.Task5Demo;

public class UpdateDemo {
    public static void main(String[] args) {
        System.out.println(updateName());

    }

    public static String updateName() {
        String studentName = "SAra";
        String newStudentName = "Sara";
        Boolean status = false;
        System.out.println("Current student name: " + studentName);
        if (!studentName.equalsIgnoreCase(newStudentName)) {
            status = true;
            System.out.println("Updated student name: " + newStudentName);
            return "Student name updated successfully.";
        } else {
            return "Current name already matches the new name";
        }
    }



}
