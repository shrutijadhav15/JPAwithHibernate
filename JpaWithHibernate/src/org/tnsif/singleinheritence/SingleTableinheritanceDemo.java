package org.tnsif.singleinheritence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableinheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first emp
		Employee e1=new Employee();
		e1.setId(121);
		e1.setName("prerna ahire");
		e1.setSalary(25000.50f);
		em.persist(e1);
		
		//second emp
		Employee e2=new Employee();
		e2.setId(122);
		e2.setName("shruti jadhav");
		e2.setSalary(45000.50f);
		em.persist(e2);
		
		//first Manager
		Manager m=new Manager();
		m.setId(125);
		m.setName("Shital moule");
		m.setSalary(42000.45f);
		m.setDeptId(45);
		m.setDeptName("computer ");
		em.persist(m);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

		
	}

}