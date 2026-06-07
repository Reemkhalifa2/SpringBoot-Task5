package com.example.Task5Demo;
public class StudentController {
    Student student = new Student(101, "Ahmed", "A");

    ({"/update-student"})
    public String update(@RequestParam String newName) {
        Student student = new Student(101, "Ahmed", "A");

        @PutMapping({"/update-student"})
        public String update(@RequestParam String newName) {
            String currentName = this.student.getName();
            this.student.setName(newName);
            return "Name Field was updated!\nOld value:" + currentName + "New Value:\n" + this.student.getName();
        }
}
