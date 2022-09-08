package com.dambroski.demo.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	
	private final StudentRepository studentRepository;
	
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}



	public List<Student> getStudents() {
		return studentRepository.findAll();
	}



	public void addNewStudent(Student student) {
		Optional<Student> studentOpitional = studentRepository.findStudentByEmail(student.getEmail());
		if(studentOpitional.isPresent()) {
			throw new IllegalStateException("Email taken");
		}
		studentRepository.save(student);
		
	}



	public void deleteStudent(Long studentId) {
		Boolean exists = studentRepository.existsById(studentId);
		if(!exists) {
			throw new IllegalStateException("The student ID:" + studentId + " does not exists");
			
		}
		studentRepository.deleteById(studentId);
	}
	
}
