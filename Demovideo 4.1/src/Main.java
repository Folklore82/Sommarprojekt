
public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.setInformation("Hans", 22, "Renässansman");
		p.buyCar("Saab", 1966);
		
		p.age = 36;
		
		Person p2 = new Person();
		p2.setInformation("Elaine", 39, "Teacher");
		p2.buyCar("Fiat", 2015);
		
		p.printPersson();
		p2.printPersson();
		
		p.tradeCar(p2);
		
		p.printPersson();
		p2.printPersson();

	}

}
