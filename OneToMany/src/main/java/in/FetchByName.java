package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByName {
 public static void main(String[] args) {
	
	 
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		             
		 Query q=em.createQuery("select h from hotel h where h.name='A2B'");
		 
		 Object o=q.getSingleResult();
		 hotel h=(hotel)o;
		 System.out.println(h);
		 
		 
		 
		 
	
}
}
