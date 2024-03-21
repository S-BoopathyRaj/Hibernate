package in;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class fetchingMultiple {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q = em.createQuery("select p.pname,p.brand,p.price from product p ");
	List<Object[]> list= q.getResultList();
	for(Object arr[]:list)
	{
		System.out.println(arr[0] +"," +arr[1]+","+arr[2]);
	}
	                 
}
}
