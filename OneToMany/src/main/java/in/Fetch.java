package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
public static void main(String[] args) {
	
  EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
  EntityManager  em=emf.createEntityManager();
   hotel h=em.find(hotel.class, 1);
   System.out.println(h);
   
   food f=em.find(food.class,1);
   System.out.println(f);
  
  
	
	
	
	
	
	
	
}
}
