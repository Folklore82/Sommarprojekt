
public class Main {

	public static void main(String[] args) {
		
		Clock c = new Clock();
	
		
		c.setTime(2, 70, 78);
		c.tick();
		c.printClock();
		
		while(true) {
			c.tick();
			c.printClock();
		}
		

	}

}
