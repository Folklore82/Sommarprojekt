
public class Car {
	public String model;
	public int value;
	public int mileage;
	
	
	public void carConstructor(String model, int value, int mileage) {
		this.model = model;
		this.value = value;
		this.mileage = mileage;
	}
	
	public void decreaseValue() {
		value -= 2000;
	}
	
	public void carPrinter() {
		System.out.println("Modell: " +model);
		System.out.println("Värde: " +value);
		System.out.println("Miltal: "+mileage);
		
	}

}
