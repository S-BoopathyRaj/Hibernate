package in;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String area;
private String district;
private String state;
private int pincode;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getState() {
	return state;
}	
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [id=" + id + ", area=" + area + ", district=" + district + ", state=" + state + ", pincode="
			+ pincode + "]";
}




}
