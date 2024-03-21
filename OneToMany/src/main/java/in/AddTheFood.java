package in;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddTheFood {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	  
	 hotel h= em.find(hotel.class, 1);
	  if(h!=null)
	  {
		  food f1=new food();
		  f1.setName("food");
		  f1.setPrice(30);
		  f1.setType("veg");
		  List<food> list =h.getFoods();
		  list.add(f1);
		  
		  
		  et.begin();
		  em.persist(f1);
		  em.merge(h);
		  et.commit();
		  System.out.println("data saved");
		  
	  }
	  else
	  {
		  System.out.println("not found");
	  }
}
}
