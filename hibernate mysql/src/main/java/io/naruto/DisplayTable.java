package io.naruto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DisplayTable {
	
	public static void printTable()
	{
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("naruto");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		
		TypedQuery<narutoentityclass> query = entitymanager.createQuery("Select e from narutoentityclass e",narutoentityclass.class);
		List<narutoentityclass> resultList = query.getResultList();
		entitymanager.close();
		entitymanagerfactory.close();
		System.out.println("The Table : ");
		for(narutoentityclass i:resultList)
		{
			System.out.println(i.getName()+" "+i.getTeamNo()+" "+i.getPost()+" "+i.getSpeciality()+" "+i.getTeacherName());
		}
		
		
	}
	
}
