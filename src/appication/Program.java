package appication;

import java.util.Locale;
import java.util.Scanner;

import spending.FuelCompumption;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("  WELLCOME  \nwhat is quantity os km in your travel? ");
		double totalkm = sc.nextDouble();
		System.out.println("how many km your car can run with one liter? ");
		double km_car = sc.nextDouble();
		System.out.println("and the price gas? ");
		double price_gas = sc.nextDouble();
		
		FuelCompumption fuel = new FuelCompumption(price_gas, km_car, totalkm);
		
		System.out.println( fuel);

		
		sc.close();
	}

}
