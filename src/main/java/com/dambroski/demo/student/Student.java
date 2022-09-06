package com.dambroski.demo.student;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	
	private Long id;
	private String name;
	private String email;
	private LocalDate dbo;
	private Integer age;
	
	public Student() {
		
	}
	
	public Student(String name, String email, LocalDate dbo, Integer age) {
		this.name = name;
		this.email = email;
		this.dbo = dbo;
		this.age = age;
	}
	
	public Student(Long id, String name, String email, LocalDate dbo, Integer age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dbo = dbo;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDbo() {
		return dbo;
	}

	public void setDbo(LocalDate dbo) {
		this.dbo = dbo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dbo=" + dbo + ", age=" + age + "]";
	}


	
	
	
	

}