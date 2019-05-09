import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		
		int list[]= {15,12,11,9,8,6,4,3,2,-3};
		printList(list);
		
		
		//Skriver ut en klon av listan så att listan inte behöver bli sorterad
		printList(bubbleSort(list.clone()));
		
		char[] charList = {'a', 'd', 'f'};
		System.out.println(findElement(charList, 'x'));
		
		
		
	
	}
	
	private static boolean findElement(char list[], char element) {
		
		for(int i=0; i<=list.length -1; i++) {
			if(list[i] == element) {
				return true;	
			}	
		}
		return false;
	}
	
	private static int[] bubbleSort(int[] list) {
		boolean swapped = true;
		int counter =0;
		while(swapped){
			
			swapped = false;
			for (int i=0; i<=list.length-2-counter;i++) {
				if(list[i] > list[i+1]) {
					//Byter plats på indexvärdena
					int temp = list[i+1];
					list[i+1] = list[i];
					list[i] = temp;
					swapped = true;
					 
				}
			}
			counter++;
			System.out.println("Counter: " +counter);
		}
		
		return list;
	}
	// Nedan ska inte vara indenterat
		public static void printList(int list[]) {
			if(list.length > 0) {
				System.out.print("[");
				for(int i=0; i<list.length-1; i++) {
					System.out.print(list[i]+",");
				}
				System.out.println(list[list.length-1]+"]");
			}
			else {
				System.out.println("[]");
			}
		}

	

}
