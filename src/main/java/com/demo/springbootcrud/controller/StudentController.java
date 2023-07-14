package com.demo.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootcrud.entity.Student;
import com.demo.springbootcrud.service.StudentService;


@RestController
public class StudentController{
	@Autowired
    private StudentService serv;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return serv.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudent(@RequestBody List<Student> students){
        return serv.saveStudents(students);
    }
    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return  serv.getStudents();
    }
    @GetMapping("/studentById/{id}")
    public Student findProductById(@PathVariable int id){
        return serv.getStudentById(id);
    }
    @GetMapping("/studentByName/{name}")
    public Student findStudentByName(@PathVariable String name){
        return serv.getStudentByName(name);
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return serv.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id){
        return serv.deleteStudent(id);
    }

}
