package in;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class train {
	@Id
private int tno;
private String name;
private String boarding;
private String dipature;
public int getTno() {
	return tno;
}
public void setTno(int tno) {
	this.tno = tno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBoarding() {
	return boarding;
}
public void setBoarding(String boarding) {
	this.boarding = boarding;
}
public String getDipature() {
	return dipature;
}
public void setDipature(String dipature) {
	this.dipature = dipature;
}
@Override
public String toString() {
	return "train [tno=" + tno + ", name=" + name + ", boarding=" + boarding + ", dipature=" + dipature + "]";
}


}
