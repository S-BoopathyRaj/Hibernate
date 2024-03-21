package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchAll {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	
	 Passenger  p = em.find(Passenger.class,2);
	 System.out.println(p);
	
	
	
	
}
}
