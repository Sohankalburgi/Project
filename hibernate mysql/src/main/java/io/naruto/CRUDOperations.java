package io.naruto;
import java.util.Scanner;
public class CRUDOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The table is displayed ");
		DisplayTable.printTable();
		int opt;
		
		while(true)
		{
		System.out.println("Enter the Number 1.Add data 2.display 3.update 4.delete data 5.exits");
		if(sc.hasNextInt()) {
			opt = sc.nextInt();
			switch(opt) {
			case 1:
				addcharacter.adddata();
				break;
			case 2:
				DisplayTable.printTable();
				break;
			case 3:
				updatecharacter.updatedata();
				break;
			case 4:
				Deletecharacter.deletedata();
				break;
			case 5:
				System.out.println("Program exiting ");
				System.exit(0);
				break;
			 default:
                 System.out.println("Invalid option. Please enter a valid option.");
                 break;
			}
		}
		else {
			System.out.println("Invalid input. Please enter a number.");
            sc.next(); // Consume the invalid input
		}
		
		}
		

	}

}
