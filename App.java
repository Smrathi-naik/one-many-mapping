package com.kodnest.mappingproject2;

import java.util.List;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
    	
    	Course c1 = new Course("JAVA");
    	Course c2 = new Course("PYTHON");
    	Course c3= new Course("C#");
    	
    	Student student = new Student("Omkar", "om@kod.in", "9988776655", null);
    	
    	c1.setStudent(student);
    	c2.setStudent(student);
    	c3.setStudent(student);
    	
    	List<Course> courses = new ArrayList<Course>();
    	courses.add(c1);
    	courses.add(c2);
    	courses.add(c3);
    	
    	student.setRef(courses);
    	
    	//Hibernate steps
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(student);
    	transaction.commit();
    	session.close();
    	factory.close();
    }
}
