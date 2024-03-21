package in;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	try {
		food f=new food();
		f.setName("vegbriyani");
		f.setPrice(100);
		f.setType("veg");
		
		
		food f1=new food();
		f1.setName("friedRice");
		f1.setPrice(120);
		f1.setType("veg");
		
		food f2=new food();
		f2.setName("dosa");
		f2.setPrice(40);
		f2.setType("veg");
		List<food> list=new ArrayList<food>();
		list.add(f);
		list.add(f1);
		list.add(f2);
		 
		hotel h=new hotel();
		h.setName("A2B");
		h.setLoc("vaddapalani");
		h.setFoods(list);
		
		
		
		
		et.begin();
		em.persist(h);
		em.persist(f);
		em.persist(f1); 
		em.persist(f2);
		et.commit();
		System.out.println("dataSaved");
		
	} catch (Exception e) {
	  e.printStackTrace();
	  et.rollback();
	 
	}
	
	
	
	
	
	
}
}
