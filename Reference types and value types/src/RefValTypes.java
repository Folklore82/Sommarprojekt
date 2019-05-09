
public class RefValTypes {

	public static void main(String[] args) {
		//Try to change int
		//int is value type
		int a= 10;
		intChanger(a);
		System.out.println(a);
		//Try to change array
		//array is reference type!
		int[]as = new int[] {3,15,90};
		arrayChanger(as);
		for(int i=0; i<as.length; i++) {
			System.out.println("x["+i+"] is "+as[i]);
		}

	}
	
	public static void intChanger(int x) {
		x = 25;
		System.out.println("x is " +x);
	}
	
	public static void arrayChanger(int[] xs) {
		xs[0] = 25;
		for(int i=0; i<xs.length; i++) {
			System.out.println("x["+i+"] is "+xs[i]);
		}
	}

}
