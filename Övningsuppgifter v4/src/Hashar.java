import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hashar {

	public static void main(String[] args) {

		HashMap<Integer, String> age = new HashMap<Integer, String>();
		age.put(36, "Hans");
		age.put(8, "Vincent");
		age.put(3, "Saga");
		age.put(39, "Elaine");
		age.put(44, "Henrik");
		
		Scanner in = new Scanner(System.in);
		int input;
		do{
			System.out.println("Enter the age of the person you are looking for: ");
			input = in.nextInt();
			String name;
			name = age.get(input);
			if(name == null){
				System.out.println("No person in the table with that age");
			}
			else{
				System.out.println(name);
			}
			
		}while(input != 1000); 
		in.close();
	}
		
		
		
		

}
	
	


