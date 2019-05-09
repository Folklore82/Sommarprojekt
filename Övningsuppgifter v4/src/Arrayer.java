import java.util.ArrayList;

public class Arrayer {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hans");
		list.add("Elaine");
		list.add("Vincent");
		list.add("Fabian");
		//L�gger Saga p� index 2
		list.add(2, "Saga");
		
		
		
		//F�rs�ker k�ra printList med null inneh�ll
		try {
			printList(null);
		}//H�r f�ngar programmet upp felet
		catch(NullPointerException e) {
			System.out.println("Something serious happened. System will now exit.");
			System.exit(1);
		}
		printList(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(30);
		list2.add(67);
		list2.add(2);
		list2.add(23);
		
		System.out.println(linearSearch(list2, 21));
		

	}
	
	public static void printList(ArrayList<String> list) {
		//Jag vet inte riktigt varf�r den h�r if-satsen beh�vs. Programmet borde v�l l�sa detta med try/Catch ovan
		if(list == null){
			throw new NullPointerException();
		}
		System.out.println(list.toString());
	}
	
	public static boolean linearSearch(ArrayList<Integer> list, Integer number) {
		
		for(int i = 0; i< list.size(); i++) {
			if(number.equals(list.get(i))) {
				return true;
			}
		}
		return false;
	}

}
