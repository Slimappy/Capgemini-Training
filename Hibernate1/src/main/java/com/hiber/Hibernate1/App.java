package com.hiber.Hibernate1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("CustomersData");
    	EntityManager em=emf.createEntityManager();
    	EntityTransaction et=em.getTransaction();
    	
    	et.begin();
    	
    	// 1st row
//    	Customer c=new Customer(1,"Taruna");
//    	CustomerDetails cd=new CustomerDetails(101,89810,"hyderabad","taruna@gmail.com");
//    	
//    	c.setCustomer_details(cd);
//    	em.persist(c);
    	
    	
    	//2nd Row
//    	Customer c2=new Customer(2,"Ayan");
//    	CustomerDetails cd2=new CustomerDetails(102,89810,"kolkata","ayan@gmail.com");
//    	
//    	c2.setCustomer_details(cd2);
//    	em.persist(c2);
    	
    	
    	
    	et.commit();
    	
    }
}
