
public class LienearSearch {

	public static void main(String[] args) {
		
		int list[] = {3, 5, 67, 3, 56, 7};
		
		System.out.println(linearSearch(list, 67));
	}
	//Testar om en siffra finns i listan
	public static boolean linearSearch(int list[], int number) {
		
		for(int i = 0; i< list.length; i++) {
			if(list[i] == number) {
				return true;
			}
		}
		return false;
	}

}
