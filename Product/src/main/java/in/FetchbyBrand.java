package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchbyBrand {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	
		EntityManager em=emf.createEntityManager();
		             
		 Query q=em.createQuery("select p from product p where p.pname='laptop'");
		 
		 Object o=q.getSingleResult();
		 product p=(product)o;
		 System.out.println(p);
		
		             
	}

}
