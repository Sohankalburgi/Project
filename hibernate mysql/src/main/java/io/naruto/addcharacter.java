package io.naruto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class addcharacter {
	public static void adddata()
	{
		Scanner sc = new Scanner(System.in);
		narutoentityclass charac = new narutoentityclass(); // object
		System.out.println("Enter the Name :");
		charac.setName(sc.nextLine());
		System.out.println("Enter team No :");
		charac.setTeamNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the teacher Name :");
		charac.setTeacherName(sc.nextLine());
		System.out.println("Enter Speciality");
		charac.setSpeciality(sc.nextLine());
		System.out.println("Enter Post");
		charac.setPost(sc.nextLine());
		
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("naruto");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		entitytransaction.begin();
		entitymanager.persist(charac);
		entitytransaction.commit();
		entitymanager.close();
		entitymanagerfactory.close();
		
		
	}
}
