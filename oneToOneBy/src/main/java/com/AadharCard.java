package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class AadharCard {
	@Id
	
private long no;
private String address;
private String dob;
private String fname;

@OneToOne(mappedBy = "a")
private person person;

public long getNo() {
	return no;
}

public void setNo(long no) {
	this.no = no;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public person getPerson() {
	return person;
}

public void setPerson(person person) {
	this.person = person;
}

@Override
public String toString() {
	return "AadharCard [no=" + no + ", address=" + address + ", dob=" + dob + ", fname=" + fname + "]";
}





}
