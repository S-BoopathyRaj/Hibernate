package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	 EntityManager em=emf.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	   food  f  =em.find(food.class,1);
	   if(f!=null)
	   {
		   f.setPrice(80);
		   et.begin();
		   em.merge(f);
		   et.commit();
	   }
	   else
	   {
		   System.out.println("Data Not Found");
	   }
	 
	   
	   hotel h=em.find(hotel.class, 1);
	   if(h!=null)
	   {
		   h.setLoc("madurai");
		   et.begin();
		   em.merge(h);
		   et.commit();
	   }
	   
}
}
