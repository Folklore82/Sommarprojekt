
public class Rekursion {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 5;
		
		recursion(x, y);

	}
	// Jag ändrade lite i metoden så att den faktiskt skriver ut alla tal MELLAN x och y
	public static void recursion(int a, int b) {
		
		if(a == (b-1)) {
			System.out.println();
		}
		else{
			System.out.println(a+1);
			recursion(a+1, b);
		}
		
	}

}
