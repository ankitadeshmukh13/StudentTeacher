
package com.ibernateOneMAnyMapping.hibernateStudentTeacher;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Teacher {
	@Id
	int tid;
	String tname;
	String subject;
	@OneToMany(mappedBy="teach")
	
	List<Student> Stud;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public List<Student> getStud() {
		return Stud;
	}
	public void setStud(List<Student> stud) {
		Stud = stud;
	}
	public Teacher(int tid, String tname, String subject, List<Student> stud) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.subject = subject;
		Stud = stud;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
