package in;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
 public static void main(String[] args) {
	
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	 EntityManager em=emf.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	 Scanner sc=new Scanner(System.in);

	 System.out.println("enter the id");
	 int id=sc.nextInt();
	 product p=em.find(product.class,id);
     if(p!=null)
     {
    	 et.begin();
    	 em.remove(p);
    	 et.commit();
    	 
     }else
     {
    	 System.out.println("Data Not Found");
     }
	 
}
}
