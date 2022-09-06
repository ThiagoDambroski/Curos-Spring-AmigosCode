package com.dambroski.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<Student> getStudents() {
		return List.of(new Student(1L,"leticia","leticia@gmail.com",LocalDate.of(2002, 5, 23),20));
	}
	
}
