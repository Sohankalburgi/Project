package io.naruto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updatecharacter {

	public static void updatedata()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name to update");
		String name = sc.nextLine();
		
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("naruto");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		narutoentityclass nec =entitymanager.find(narutoentityclass.class,name);
	
		if(nec!=null) {
			System.out.println("Enter Change 1.Team NO 2.TeacherName 3.Speciality 4.Post");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n){
				case 1:
					System.out.println("Enter the Team No :");
					nec.setTeamNo(sc.nextInt());
					sc.nextLine();
					break;
				case 2:
					
					System.out.println("Enter the Teacher Name :");
					nec.setTeacherName(sc.nextLine());
					break;
				case 3:
					System.out.println("Enter the Speciality :");
					nec.setSpeciality(sc.nextLine());
					break;
				case 4:
					System.out.println("Enter the Post :");
					nec.setPost(sc.nextLine());
					break;
			}
			entitytransaction.begin();
			entitymanager.persist(nec);
			entitytransaction.commit();
		}
		else {
			System.out.println("No entry found");
		}
		
		entitymanager.close();
		entitymanagerfactory.close();
		
	}
}
