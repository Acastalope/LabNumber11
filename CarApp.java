package LabNumber11;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		String contin = "y";
		Scanner sc = new Scanner(System.in);

		Car[] userMake = new Car [1]; 
		Car[] userModel = new Car [2]; 
		Car[] year = new Car [3];
		Car[] price = new Car [4];
		
		while(contin.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Grand Circus Motors admin console!");	
			System.out.println("\nHow many cars are you entering? ");	

			int input = sc.nextInt();	
			sc.nextLine();
			System.out.println("\nCar Make: ");
			String userMakeSelect= sc.nextLine();

			System.out.println("\nCar Model: "); 
			String userModelSelect= sc.nextLine();

			System.out.println("\nCar Year: ");
			int yearCar = sc.nextInt();	

			System.out.println("\nCar Price: "); 
			double priceCar = sc.nextDouble();	

			ArrayList<Car> cars = new ArrayList<Car>();
					
			cars.add(new Car(userMakeSelect, userModelSelect, yearCar, priceCar));
			
			System.out.println();

			System.out.println(cars);
			System.out.println();
			
			System.out.println("Would you like to enter another car(s)? y or n");
			sc.nextLine();
					
		contin = sc.next();
		}
	}
}

