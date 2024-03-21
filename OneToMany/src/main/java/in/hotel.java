package in;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int hid;
private String name;
private String loc;

@OneToMany
List<food> foods;



public int getHid() {
	return hid;
}
public void setHid(int hid) {
	this.hid = hid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public List<food> getFoods() {
	return foods;
}
public void setFoods(List<food> foods) {
	this.foods = foods;
}
@Override
public String toString() {
	return "hotel [hid=" + hid + ", name=" + name + ", loc=" + loc + ", foods=" + foods + "]";
}

}
