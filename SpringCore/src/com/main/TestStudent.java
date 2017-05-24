package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;
import com.service.StudentService;

public class TestStudent {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:/spring1.xml");
	StudentService service=(StudentService)ctx.getBean(com.service.StudentService.class);
	/*Student st=new Student();
	st.setUserName("Shiv");
	st.setPassWord("1234");
	service.save(st);*/
	service.list();
	
}
}
