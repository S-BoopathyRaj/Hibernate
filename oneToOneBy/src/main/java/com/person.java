package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity


public class person {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private int age;
private long phone;
private String gender;

@OneToOne
@JoinColumn
private AadharCard a;

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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public long getPhone() {
	return phone;
}

public void setPhone(long phone) {
	this.phone = phone;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public AadharCard getA() {
	return a;
}

public void setA(AadharCard a) {
	this.a = a;
}

@Override
public String toString() {
	return "person [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", gender=" + gender + "]";
}



}
