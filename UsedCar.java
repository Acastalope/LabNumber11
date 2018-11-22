package LabNumber11;

import java.text.DecimalFormat;

public class UsedCar extends Car {

	
	DecimalFormat df = new DecimalFormat("#.00");
	
	private int carMileage;
	
	public UsedCar(int carMileage) {
		super();
		this.carMileage= carMileage;
	}
	
	public double getCarMileage() {
		return carMileage;
	}

	public void setCarMileage(int carMileage) {
		this.carMileage = carMileage;
	}

	public UsedCar(String carMake, String carModel, int carYear, double carPrice, int carMileage) {
		super(carMake, carModel, carYear, carPrice);
		this.carMileage = carMileage;
	}
	@Override
	public String toString() {
		return ("Make = " + super.getCarMake() + ", Model = " + super.getCarModel() + ", Year = " + super.getCarYear() + ", Price = $" + df.format(super.getCarPrice()) + ", " + "Mileage =" + carMileage);
	}
	
	}
