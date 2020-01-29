package spending;

public class FuelCompumption {
	 
	private double gas_price;
	private double kmPerLiters;
	private double totalOfKm;
	
	public FuelCompumption(double gas_price, double kmPerLiters, double totalOfKm) {
		this.gas_price = gas_price;
		this.kmPerLiters = kmPerLiters;
		this.totalOfKm = totalOfKm;
	}

	public double getGas_price() {
		return gas_price;
	}

	public double getKmPerLiters() {
		return kmPerLiters;
	}


	public double getTotalOfKm() {
		return totalOfKm;
	}

	public double totalFuelCompumption() {
		return totalOfKm / kmPerLiters * gas_price;
	}
	
	public String toString() {
		return "You gona need " + String.format(" %.2f", totalOfKm / kmPerLiters) + " liters, your spend with gas gona be: R$ " + String.format("%.2f", totalFuelCompumption());
	}
}
