package in;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class namedParameter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Starting range");
		double start=sc.nextDouble();
		System.out.println("enter the ending range");
		double end =sc.nextDouble();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		 Query  q= em.createQuery("select p from product p where p.price between :start and :end");
		  q.setParameter("start",start);
		  q.setParameter("end", end);
		        List<product> list =q.getResultList();
		        for(product p:list)
		        {
		        	System.out.println(p);
		        }
		  
	}
}
