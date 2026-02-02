package com.kodnest.mappingproject2;

import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cid;
	
	@Column
	String cname;
	
	@ManyToOne
	@JoinColumn(name="sid")
	Student student;
	
	public Course() {
	// TODO Auto-generated constructor stub
	}
	
	public Course(int cid, String cname, Student student) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.student = student;
	}
	public Course(String cname, Student student) {
		super();
		this.cname = cname;
		this.student = student;
	}
	public Course(String cname) {
	    this.cname = cname;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", student=" + student + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cid, cname, student);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return cid == other.cid && Objects.equals(cname, other.cname) && Objects.equals(student, other.student);
	}
	
}
