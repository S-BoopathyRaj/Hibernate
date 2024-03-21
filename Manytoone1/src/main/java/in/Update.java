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
	Passenger p1=em.find(Passenger.class, 2);
	if(p1!=null)
	{
		
		p1.setPname("jagan");
         et.begin();
		em.merge(p1);
		et.commit();
		System.out.println("Data updateds");
		
	}
	else
	{
		System.out.println("data Not Found");
	}
}
}
