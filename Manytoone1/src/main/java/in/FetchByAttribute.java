package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import antlr.collections.List;

public class FetchByAttribute {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	
//    Passenger p = em.find(Passenger.class, 2);
 
    Query q= em.createNamedQuery("select  p.pname from Passenger p");
    Object o	=  q.getSingleResult();
    Passenger p=(Passenger)o;
    System.out.println(p);
   
	
}
}
