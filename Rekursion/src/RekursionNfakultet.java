
public class RekursionNfakultet {

	public static void main(String[] args) {
		
		System.out.println(nFakultet(5));

	}
	//metoden multiolicerar alla tal mellan n och 1
	private static int nFakultet(int n) {
		int sum;
		//N�r n blir 1 slutar metoden att anropa sig sj�lv och returnerar 1
		if((n == 1) || (n == 0)) {
			return 1;
		}
		else {
			//H�r multipliceras n med n-1, n-2, n-3 osv.
			return n * nFakultet(n-1);
		}
		
	}

}
