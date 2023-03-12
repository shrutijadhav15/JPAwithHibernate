package org.tnsif.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory Factory=Persistence.createEntityManagerFactory("JPA-PU");
				 EntityManager em=Factory.createEntityManager();
				//first emp
				Employee e1=new Employee();
				e1.setId(121);
				e1.setName("shital");
				e1.setSalary(25000.50f);
				em.persist(e1);
	
				//first Manager
				Manager m=new Manager();
				m.setDeptId(12);
				m.setDeptName("computer");
			
			  
				
				em.persist(m);
				em.getTransaction().commit();

				System.out.println("Data added successfully");
				em.close();

				Factory.close();
				

	}

	
}
