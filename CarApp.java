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
		
		while(contin.equalsIgnoreCase("y")) { // while loop to continue prompting user while they enter "y" or "Y" to the question of whether or not they want to continue
			System.out.println("Welcome to the Grand Circus Motors admin console!");	
			System.out.println("\nHow many cars are you entering? ");	

			int input = sc.nextInt();	
			sc.nextLine();
			System.out.println("\nCar Make: ");
			String userMakeSelect= sc.nextLine(); // taking in user input as a string

			System.out.println("\nCar Model: "); 
			String userModelSelect= sc.nextLine(); // taking in user input as a string

			System.out.println("\nCar Year: ");
			int yearCar = sc.nextInt();	// taking in user input as an int

			System.out.println("\nCar Price: "); 
			double priceCar = sc.nextDouble(); // taking in user input as a double

			ArrayList<Car> cars = new ArrayList<Car>(); // trying to make ArrayList of the user input on car make, model, year, and price
					
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

