package org.tnsif.tableperclass;

//driver class
//program to demonstrate 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import org.tnsif.singleinheritance.Employee;
//import org.tnsif.singleinheritance.Manager;

public class TablePerClass {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first emp
		Employee1 e1=new Employee1();
		e1.setId(121);
		e1.setName("Manoj Tiwari");
		e1.setSalary(25000.50f);
		em.persist(e1);
		
		//second emp
		Employee1 e2=new Employee1();
		e2.setId(122);
		e2.setName("Sahil Pawar");
		e2.setSalary(45000.50f);
		em.persist(e2);
		
		//first Manager
		Manager1 m=new Manager1();
		m.setId(125);
		m.setName("Saurav Khairnar");
		m.setSalary(42000.45f);
		m.setDeptid(45);
		m.setDeptname("Information Technology");
		em.persist(m);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

		
	}

}