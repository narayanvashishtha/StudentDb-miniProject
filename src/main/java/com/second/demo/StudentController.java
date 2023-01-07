package com.second.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentService.addStudentService(student);
        return new ResponseEntity<>("New student added successfully", HttpStatus.CREATED);
    }
    @GetMapping("/get-student-by-name/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name){
        Student student = studentService.getStudentByNameService(name);  // Assign student by calling service layer method

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
}