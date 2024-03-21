package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class fetchAll {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
    EntityManager em=emf.createEntityManager();
    Query q = em.createQuery("select p from product p ");
    java.util.List<product> l=q.getResultList();   
    for(product p: l)
    {
    	System.out.println(p);
    }
	
	
	
	
	
	
}
}
