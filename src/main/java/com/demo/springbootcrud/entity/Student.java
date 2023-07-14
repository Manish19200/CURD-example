package com.demo.springbootcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="STUDENT_TBL")
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private int clazz;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getclazz() {
		return clazz;
	}
	public void setclazz(int clazz) {
		this.clazz = clazz;
	}

}
