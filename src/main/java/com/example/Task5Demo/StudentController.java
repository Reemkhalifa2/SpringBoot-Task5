package com.example.Task5Demo;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class StudentController {
    Student student = new Student(101, "Ahmed", "A");

    @PutMapping({"/updateStudent"})
    public String update(@RequestParam String newName) {
        String currentName = this.student.getName();
        this.student.setName(newName);
        return "Name Field was updated!\nOld value:" + currentName + "New Value:\n" + this.student.getName();
    }
}
