
public class Bubblesort {

	public static void main(String[] args) {
		
		int list[] = {122, 100, 590, 7, 5, 4, 2,-56};
		
		bubbleSort(list);
		
		for(int i = 0; i<list.length ; i++) {
			System.out.println(list[i]);
		}
		
		
		

	}
	
	public static int[] bubbleSort(int list[]) {
		
		boolean looping = true;
		int counter = 1;
		while(looping){
		
			for(int i = 0; i< list.length -1; i ++) {
				if(list[i] < list[i+1]) {
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
				}
				
			}
			counter ++;
			if(counter == list.length) {
				looping = false;
		}
		
		}

		return list;
		
	}

}
