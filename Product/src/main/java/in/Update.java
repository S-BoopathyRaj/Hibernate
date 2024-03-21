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
	 //find the data
	 product p=em.find(product.class,1);
	 if(p!=null)
	 {
		 p.setPrice(60000);
		 et.begin();
		 em.merge(p);
		 et.commit();
		 System.out.println("DataSaved");
	 }
	 else
	 {
		 System.out.println("Data Not Found");
	 }
	
	
	
	
	
	
}
}
