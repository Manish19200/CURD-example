package com.itcinfotech.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itcinfotech.springbootcrud.entity.Student;
import com.itcinfotech.springbootcrud.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	
	public List<Student> saveStudents(List<Student> students) {
		return repo.saveAll(students);
	}
	
	public List<Student> getStudents(){
		return repo.findAll();
	}
	
	public Student getStudentById(int id){
		return repo.findById(id).orElse(null);
	}
	
	public Student getStudentByName(String name) {
		return repo.findByName(name);
	}
		public String deleteStudent(int id) {
			repo.deleteById(id);
			return "Student with id "+id+" deleted";
	}
		public Student updateStudent(Student student){
		Student existingStudent=repo.findById(student.getId()).orElse(null);
		existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setclazz(student.getclazz());
        return repo.save(existingStudent);
		
	}
}
