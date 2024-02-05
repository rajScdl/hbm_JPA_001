package com.app.test;

import com.app.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("raj");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		Employee emp=new Employee();
		emp.setAddress("Mumbai");
		emp.setContact(987654210l);
		emp.setName("Nitin");
		emp.setDept("DEV");
		manager.persist(emp);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
