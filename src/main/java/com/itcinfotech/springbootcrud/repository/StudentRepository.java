package com.itcinfotech.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itcinfotech.springbootcrud.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	Student findByName(String name);

}
