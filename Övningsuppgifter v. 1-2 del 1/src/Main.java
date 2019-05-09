
public class Main {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.carConstructor("Fiat", 30000, 15000);
		
		Car c2 = new Car();
		c2.carConstructor("Folkvagn", 10000, 50000);
		
		
		
		
		c2.carPrinter();
		c2.decreaseValue();
		c2.carPrinter();
		
		
		House h1 = new House();
		h1.houseConstructor(185, 2, 5650000, 1912, "Prästängsvägen 36", c1);
		// h1.housePrinter();
		
		House h2 = new House();
		h2.houseConstructor(170, 2, 4000000, 1945, "Borgåsvägen 2", c2);
		
		Person p1 = new Person();
		p1.personConstructor("Hasse", "renässansman", 36, "man", 185, h1);
		//p1.personPrinter();
		
		Person p2 = new Person();
		p2.personConstructor("Annika", "Kick-ass programmerare", 45, "kvinna", 183, h2);
		//p2.personPrinter();
		
		Person p3 = new Person();
		p3.personConstructor("Elaine", "lärare", 39, "snygg-fru", 170, h1);
		//p3.personPrinter();
		
		
	}

}
