
public class House {
	private int area;
	private int floors;
	private int value;
	private int year;
	public String adress;
	public Car car;
	
	public void houseConstructor(int area, int floors, int value, int year, String adress, Car car) {
		this.area = area;
		this.floors = floors;
		this.value = value;
		this.year = year;
		this.adress = adress;
		this.car = car;
	}
	
	public void housePrinter() {
		System.out.println("Huset �r "+area+" m2 och har "+floors+" v�ningar.");
		System.out.println("Det kostar " +value+" kronor och �r byggt �r "+year+"." );
		System.out.println("Adressen �r " +adress);
	}
	
	

}
