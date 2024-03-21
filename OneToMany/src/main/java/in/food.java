package in;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int fid;
private String name;
private double price;
private String type;
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "food [fid=" + fid + ", name=" + name + ", price=" + price + ", type=" + type + "]";
}


}
