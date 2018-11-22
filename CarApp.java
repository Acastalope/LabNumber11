package LabNumber11;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		String contin = "y";
		Scanner sc = new Scanner(System.in);
		String userMakeSelect = null;
		String userModelSelect = null;
		int yearCar = 0;
		double carPrice = 0;
		int carMileage = 0;
		
		
		ArrayList<Car> purchasedCarList = new ArrayList<>();
		
		Car newCar1 = new Car ("Hyundai", "Elantra", 2017, 18000);
		Car newCar2 = new Car ("Mazda", "Miata", 2018, 26000);
		Car newCar3 = new Car ("Chevrolet", "Cruze", 2019, 19000);

		Car usedCar1 = new UsedCar ("Chevrolet", "Sonic", 2012, 7000, 85000);
		Car usedCar2 = new UsedCar ("Toyota", "Camry", 2011, 5500, 98000);
		Car usedCar3 = new UsedCar ("Ford", "Escort", 2004, 3000, 165000);
		

		ArrayList<Car> cars = new ArrayList<>();
		cars.add(newCar1);
		cars.add(newCar2);
		cars.add(newCar3);
		cars.add(usedCar1);
		cars.add(usedCar2);
		cars.add(usedCar3);
	
		
		System.out.println("Welcome to Grand Circus Motors!");
		System.out.println();
		
		{
		while (contin.equalsIgnoreCase("y")) { // while loop to continue prompting user while they enter "y" or "Y" to
												// the question of whether or not they want to continue
			
			System.out.println("Would you like to: \n 1- add a car OR \n 2- buy a car? ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			if (choice == 1) {
			System.out.println("Enter the car make:");
			userMakeSelect = sc.nextLine();
			System.out.println("Enter the car model:");
			userModelSelect = sc.nextLine();
					
			yearCar = Validator.getInt(sc, "Enter the car year:\n", 1940, 2020);
			
			carPrice = Validator.getDouble(sc, "Enter the car price: \n");
			
			System.out.println();
			Car newCar = new Car (userMakeSelect, userModelSelect, yearCar, carPrice);
			System.out.println(newCar);
						
			cars.add(newCar);			
			for (int i = 0; i < cars.size(); i++) {
				System.out.println(i + 1 +". " + cars.get(i));
				
			}}
			
			else if (choice == 2) {
				System.out.println();
				System.out.println("Check out our inventory:");
			for (int i = 0; i < cars.size(); i++) {
				System.out.println(i + 1 +". " + cars.get(i));
			}
			System.out.println();
			System.out.println("Enter the number of the car you want to purchase: ");
			
			int input = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			purchasedCarList.add(cars.get(input - 1));
			System.out.println(purchasedCarList);
			System.out.println();
			
			cars.remove(input -1);
			
			System.out.println("Thank you for your purchase!");
			//System.out.println("Thank you for your purchase. Our finance department will be in touch shortly. Have a great day!");
			//System.out.println(purchasedCarList);
			}
			System.out.println();
			contin = Validator.getString(sc, "Would you like to continue? y or n");
			
			System.out.println();
			
			}
			
		System.out.println("Thank you for your purchase! Our finance department will be in touch shortly. Have a great day!");
		System.out.println();
		System.out.println(purchasedCarList);
		System.out.println();
		System.out.println("Good-bye!");	
	}}

	}