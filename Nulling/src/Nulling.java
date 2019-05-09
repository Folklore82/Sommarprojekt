import java.util.Scanner;

public class Nulling {

	public static void main(String[] args) {
		
		String input = getUserInput();
		System.out.println(input);
	}
	
	public static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to give input?");
		String response = sc.nextLine();
		if (response.equals("no")){
			return null;
		}
		else {
			return response;
		}
		
	}

}
