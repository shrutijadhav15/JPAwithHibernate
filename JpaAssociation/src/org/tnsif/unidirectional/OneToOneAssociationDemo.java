package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneAssociationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first employee
		Employee emp1=new Employee();
		emp1.setEmpname("pererna ahire");
		
		//second employee
		Employee emp2=new Employee();
		emp2.setEmpname("Shruti jadhav");
		
		//first address
		Address a1=new Address();
		a1.setPincode(422003);
		a1.setArea("adgaon");
		a1.setCity("nashik");
		a1.setState("Maharashtra");
		
		//second address
		Address a2=new Address();
		a2.setPincode(422004);
		a2.setArea("CBS");
		a2.setCity("Nashik");
		a2.setState("Maharashtra");
		
		emp2.setAddress(a1);
		emp1.setAddress(a2);
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();
	}

}