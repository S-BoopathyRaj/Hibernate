package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
    train t=new train();
    t.setTno(123);
    t.setName("express");
    t.setBoarding("chennai");
    t.setDipature("madurai");
    
    Passenger p=new Passenger();
    p.setPname("boopathy");
    p.setMobile(733914);
    p.setT(t);
   
    Passenger p1=new Passenger();
    p1.setPname("u1");
    p1.setMobile(73391439);
    p1.setT(t);
     et.begin();
     em.persist(t);
     em.persist(p1);
     em.persist(p);
     et.commit();
    

 
	
}
}
