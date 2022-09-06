package com.dambroski.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
	
	public List<Student> getStudents() {
		return List.of(new Student(1L,"leticia","leticia@gmail.com",LocalDate.of(2002, 5, 23),20));
	}
	
}
