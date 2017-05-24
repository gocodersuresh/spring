package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.model.Student;

@Component
public class StudentService {
	@Autowired
	StudentDao stud;

	@Transactional 
	public void list()
	{
		List<Student> st=stud.list();
		for(Student s:st)
		{
			System.out.println("ID==>"+s.getStudentId());
			System.out.println("User Name==>"+s.getUserName());
			System.out.println("Password==>"+s.getPassWord());
		}
	}
	@Transactional 
	public void save(Student st)
	{
		stud.save(st);	
	}
}
