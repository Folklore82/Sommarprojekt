// Handlar inte alls om exceptions utan är övningsuppgift v.5 uppgift nr 2!!!
public class Exceptions {

	public static void main(String[] args) {
		int[] numberList1 = {}; // tom lista
		int[] numberList2 = {2, 5, 10, -5, 10};

		System.out.println("50 exists in numbersList1: " + searchNumber(numberList1, 50)); //Borde returnera false
		System.out.println("-5 exists in numbersList2: " + searchNumber(numberList2, -5)); //Borde returnera true

		}
		private static boolean searchNumber(int[] list, int number){
		for(int i=0;i<list.length;i++){
		if (list[i] == number)
		return true;
		}
		return false;
		}
		}
