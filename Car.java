// Ask the user to enter a number of cars
// For each car, ask the user for the make, model, year, and price of the car
package LabNumber11;

import java.text.DecimalFormat;

public class Car {

	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;
	DecimalFormat df = new DecimalFormat("#.00");

	public Car() {
	}

	public Car(String carMake, String carModel, int carYear, double carPrice) {
		super();
		this.carMake = carMake;
		this.carModel = carModel;
		this.carYear = carYear;
		this.carPrice = carPrice;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return String.format("Make = " + carMake + ", Model = " + carModel + ", Year = " + carYear
				+ ", Price = $" + df.format(carPrice));

	}
}
