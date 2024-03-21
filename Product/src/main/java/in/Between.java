package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.*;

public class Between {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Starting range");
	double start=sc.nextDouble();
	System.out.println("enter the ending range");
	double end =sc.nextDouble();
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query  q= em.createQuery("select p from product p where p.price between ?1 and ?2");
	q.setParameter(1,start);
	q.setParameter(2, end);
	        List<product> list =q.getResultList();
	        for(product p:list)
	        {
	        	System.out.println(p);
	        }
	  
}
}
