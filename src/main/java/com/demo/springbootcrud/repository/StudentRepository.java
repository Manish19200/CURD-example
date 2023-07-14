package com.demo.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springbootcrud.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	Student findByName(String name);

}
