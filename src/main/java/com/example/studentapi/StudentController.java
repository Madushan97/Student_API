package com.example.studentapi;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController<repository> {

    StudentRepositary repository = new InMemoryStudentRepository();

    // RestEndpoint
    // Create a Student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student) {

        repository.save(student);
    }

    // retrieve student
    @GetMapping("/student/{id")

    public Student getStudent(@PathVariable String id) {
        return repository.get(id);
    }

    // delete student

    @DeleteMapping("/student")

    public Student deleStudent() {

        Object student;
        repository.deleStudent(student);
    }
    // update student

    @PatchMapping("/student")

    public Student patchstStudent() {
        Object student;
        repository.patchstStudent(student);
    }

}
