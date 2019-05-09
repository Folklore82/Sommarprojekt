
public class Main {
	
	public static void main(String[] args) {
		Car c1 = new Car("Fiat", "Hasse");
		Car c2 = new Car("Ford", "Elaine");
		Car c3 = new Car("Folkvagn", "Rasmus");
		Car c4 = new Car("Renault", "Eva");
		Car c5 = new Car("Audi", "Henrik");
		
		System.out.println(c2.getModel()+": "+c2.getOwner());
		System.out.println(c3.getModel()+": "+c3.getOwner());
		
		ParkingLot p1 = new ParkingLot("Domino");
		
		p1.addCar(c1);
		p1.addCar(c2);
		p1.addCar(c3);
		p1.addCar(c4);
		p1.addCar(c5);
		
		System.out.println(p1.getCarCounter());
		System.out.println(p1.getFreeSpaces());
		
		
	}
}
