package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	Address a=new Address();
	a.setArea("Arumbakkam");
	a.setDistrict("chennai");
	a.setPincode(626125);
	a.setState("TamilNadu");
	
	
	Person p=new Person();
	p.setName("Boopathhy");
	p.setAge(21);
	p.setGender("male");
	p.setPhone(733913);
	p.setA(a);
	 
	et.begin();
	em.persist(p);
    em.persist(a);
    et.commit();
	
	
}
}
