package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

@Column
private String userName;

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassWord() {
	return passWord;
}

public void setPassWord(String passWord) {
	this.passWord = passWord;
}

@Column
private String passWord;

}
//Student(userName varchar(20),passWord