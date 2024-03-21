package in;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int pid;
private String pname;
private long mobile;

@ManyToOne
private train t;


public int getPid() {
	return pid;
}


public void setPid(int pid) {
	this.pid = pid;
}


public String getPname() {
	return pname;
}


public void setPname(String pname) {
	this.pname = pname;
}


public long getMobile() {
	return mobile;
}


public void setMobile(long mobile) {
	this.mobile = mobile;
}


public train getT() {
	return t;
}


public void setT(train t) {
	this.t = t;
}


@Override
public String toString() {
	return "Passenger [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + ", t=" + t + "]";
}

}
