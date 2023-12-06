package io.naruto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deletecharacter {

	public static void deletedata()
	{
Scanner sc = new Scanner(System.in);
		
		// I choosed name because it is primary key
		System.out.println("Enter Name to delete");
		
		String name = sc.nextLine();
		
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("naruto");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		narutoentityclass nec =entitymanager.find(narutoentityclass.class,name);
		
		if(nec!=null)
		{
			entitytransaction.begin();
			entitymanager.remove(nec);
			entitytransaction.commit();
		}
		else {
			System.out.println("Entry doesn't exists");
		}
	}
}
