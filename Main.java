package design;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Welcome to our site!");
		System.out.println("Do you want to order or repair?\n");
		String user_input=sc.nextLine();
		
		if(user_input.toLowerCase().equals("repair")) {
			Rep repair=new Rep();
			System.out.println("Enter accessory to repair");
			String accessory=sc.nextLine();
			repair.ProcessAccessoryRepair(accessory);
			
			System.out.println("Enter Model Name to repair");
			String modelrep=sc.nextLine();
			repair.ProcessPhoneRepair(modelrep);
		}
		
		
		
		else if(user_input.toLowerCase().equals("order")) {
			Ord order=new Ord();
			System.out.println("Enter Model Name to order");
			String model=sc.nextLine();
			order.ProcessOrder(model);
			
		}
		
	}

}
