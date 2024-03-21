package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.*;

public class FetchingByUser {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Pname");
	String Pname=sc.next();
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select p from product p where  p.pname=?1");
	q.setParameter(1,Pname);
	Object o=q.getSingleResult();
	product p=(product)o;
	System.out.println(p);
	
	
	
}
}
