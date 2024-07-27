package com.ibernateOneMAnyMapping.hibernateStudentTeacher;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table(name="Student")
@Entity
public class Student {
	@Id
	int sid;
	String sname;
	int age;
	
	@ManyToOne
	@JoinColumn(name="tea_stud")
	public Teacher teach;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Teacher getTeach() {
		return teach;
	}

	public void setTeach(Teacher teach) {
		this.teach = teach;
	}

	public Student(int sid, String sname, int age, Teacher teach) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.teach = teach;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
