package in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
product p=new product();
p.setId(1);
p.setPname("laptop");
p.setBrand("HP");
p.setPrice(20000);
 EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
 EntityManager EM=emf.createEntityManager();
 EntityTransaction Et=EM.getTransaction();
 
 Et.begin();
 EM.persist(p);
 Et.commit();
 System.out.println("DataSaved");

}
}
