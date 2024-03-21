package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class find {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	   person p=em.find(person.class, 1);
	   AadharCard card=p.getA();
	   System.out.println(card);
	   System.out.println("-------------------------------");
	   AadharCard c=em.find(AadharCard.class,876543L);
	   person person=c.getPerson();
	   System.out.println(person);
}
}
