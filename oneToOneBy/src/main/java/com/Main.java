package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	try
	{
		person p=new person();
		p.setAge(12);
		p.setGender("male");
		p.setName("Karthikeyan");
		p.setPhone(98765432);
			
		AadharCard a= new AadharCard();
		a.setNo(876543);
		a.setDob("12/12/20000");
		a.setFname("ganeshan");
		a.setAddress("3,vellor");
		a.setPerson(p);
		p.setA(a);
		
		

		
		
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		
		
	}catch (Exception e) {
		et.rollback();
		e.printStackTrace();
	}
}
}
