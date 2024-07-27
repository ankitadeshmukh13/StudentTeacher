package com.ibernateOneMAnyMapping.hibernateStudentTeacher;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	cfg.addAnnotatedClass(Teacher.class);
    	cfg.addAnnotatedClass(Student.class);
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	
    	Teacher t=new Teacher();
    	t.setTid(11);
    	t.setTname("Varsha");
    	t.setSubject("C++");
    	
    	Student s=new Student(1,"Annu",21, t);
    	Student s1=new Student(2,"Mayuri",20, t);
    	Student s2=new Student(3,"Sanita",32, t);
//    	Student s=new Student(1,"Annu",21, t);
    	List<Student> stu_list=new ArrayList<Student>();
    	
    	stu_list.add(s);
    	stu_list.add(s1);
    	stu_list.add(s2);
    	
    	t.setStud(stu_list);
    	Transaction ts=session.beginTransaction();
    	session.save(t);
    	session.save(s);
    	session.save(s1);
    	session.save(s2);
    	ts.commit();
    	System.out.println("Inserted");
    	
    	
    	
    	
    }
}
