package in;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
	@Id
  private int id;
  private String pname;
  private String brand;
  private double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "product [id=" + id + ", pname=" + pname + ", brand=" + brand + ", price=" + price + "]";
}
  
  
}
