package com.kodnest.mappingproject2;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;

@Column(name= "sname")
	String name;

@Column
	String email;

@Column
	String phone;
	
@OneToMany(mappedBy = "student",cascade=CascadeType.ALL)
	List<Course> ref;
	public Student() {
	
	}
	public Student(int id, String name, String email, String phone, List<Course> ref) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.ref = ref;
	}
	public Student(String name, String email, String phone, List<Course> ref) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.ref = ref;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Course> getRef() {
		return ref;
	}
	public void setRef(List<Course> ref) {
		this.ref = ref;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", ref=" + ref + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, phone, ref);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone) && Objects.equals(ref, other.ref);
	}
	
	
}
