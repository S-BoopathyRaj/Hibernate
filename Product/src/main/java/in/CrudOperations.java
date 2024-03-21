package in;



	import java.util.List;
	import java.util.Scanner;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;
	import javax.persistence.Query;

	public class CrudOperations {
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			boolean continueLoop=true;
			do {
	            
			System.out.println("Choose the statement");
			System.out.println("1.Insertion\n2.Deletion\n3.Update\n4.Fetch\n5.fetchObjectByArrayList\n6.fetchBypname\n7.fetchByPriceBetween\n8.fetchByOnlyBrand");
			int choose=sc.nextInt();
			
			switch(choose) {
			case 1:{
				insertRecord();
				
			}break;
			case 2:{
				deleteRecord();
			break;	
			}
			case 3:{
				updateRecord();
				
			}break;
			case 4:{
				fetchRecord();
			}break;
			case 5:{
				fetchObjectByArrayList();
			}break;
			case 6:{
				fetchBypname();
			}break;
			case 7:{
				fetchByPriceBetween();
			}break;
			case 8:{
				fetchByOnlyBrand();
			}break;
			
			default: {
				System.out.println("Invalid choice, Do it again!\n");
				continueLoop=false;
			break;
			}
		  }
	   }while (continueLoop);
	 }
	public static void insertRecord(){

		         product p=new product();
				System.out.println("Enter the Id: ");
				int id=sc.nextInt();
				System.out.println("Enter Product name: ");
				String pname=sc.next();
				System.out.println("Enter Product Brand: ");
				String brand=sc.next();
				System.out.println("Enter Product Price: ");
				double price=sc.nextDouble();
				System.out.println("Enter Product quantity: ");
				int quantity=sc.nextInt();
			
				
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
				EntityManager em=emf.createEntityManager();
				EntityTransaction et=em.getTransaction();
			   
				p.setId(id);
				p.setPname(pname);
				p.setBrand(brand);
				p.setPrice(price);
				et.begin();
				em.persist(p);
				et.commit();
				
				System.out.println("Data Added Successfully");
				
			}


	public static void deleteRecord(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		System.out.println("Enter your id: ");
		int id=sc.nextInt();
		
		product p=em.find(product.class, id);
		
		if(p!=null) {
			et.begin();
			em.remove(p);
			et.commit();
			System.out.println("Data Successfully removed");
			
		}else {
			System.out.println("Data not Found");
		}
	}

	public static void updateRecord()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		System.out.println("Enter your id: ");
		int  id=sc.nextInt();
		System.out.println("Enter your Price: ");
		double price=sc.nextDouble();
		product p= em.find(product.class,id);
		
		if(p!=null) {
			p.setPrice(price);
			et.begin();
			em.merge(p);
			et.commit();
			System.out.println("Data successfully fetched");
		}else{
			System.out.println("Id not found");
		}
	}


	public static void fetchRecord(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		System.out.println("Enter your id: ");
		int id=sc.nextInt();
		 product p = em.find(product.class, id);
		
		System.out.println(p);
		
		System.out.println("Data Fetched");
	}
	public static void fetchObjectByArrayList(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select p.pname,p.brand,p.price from Product p");
		
		List <Object[]> l= q.getResultList();
		for(Object arr[]:l) {
			System.out.println(arr[0]+","+arr[1]+","+arr[2]);
		}
	}
	public static void fetchBypname(){
		System.out.println("Enter Product name: ");
		String name=sc.next();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select p from Product p where p.pname=?1");
		
		q.setParameter(1, name);
		
		List<product> l=q.getResultList();
//		Product p=(Product)o;
		for(product p: l) {
			System.out.println(p);
		}
		
//		System.out.println(l);
	}
	public static void fetchByPriceBetween(){
		System.out.println("Enter starting price: ");
		double start=sc.nextDouble();
		System.out.println("Enter ending price: ");
		double end=sc.nextDouble();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select p from Product p where p.price between ?1 and ?2 order by p.price asc");
		
		q.setParameter(1, start);
		q.setParameter(2, end);
		
		List<product> l=q.getResultList();
		for(product p: l) {
			System.out.println(p);
		}
	}
	public static void fetchByOnlyBrand(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select p.brand from Product p");
		List<String> l=q.getResultList();
		for(String s:l) {
			System.out.println(s);
		}
	  }
	}

