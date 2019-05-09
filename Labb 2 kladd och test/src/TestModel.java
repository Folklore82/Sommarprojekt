import java.util.HashMap;

public class TestModel {
	//Minnes-Hashmapen
	HashMap<Integer, Long> memory = new HashMap<Integer, Long>();
	
	//metod f�r att h�mta v�rde fr�n Hashmapen fr�n
	private Long getValueFromMemory(Integer number) {
		return memory.get(number);
	}
	
	//Metod f�r att l�gga in v�rden i Hashmapen. Den ska egentligen vara PRIVATE!
	private void addValueToMemory(Integer value, Long result) {
		memory.put(value, result);
	}
	//T�mmer minnet
	public void clearMemory() {
		memory.clear();
	}
	//Utf�r ber�kningen
	private long computePower(int power) {
		if(power == 0) {
			return 1;
		}
		else if(power == 1) {
			return 2;
		}
		else {
			return 2 * computePower(power-1);
		}
	}
	//Tar ett v�rde och k�r det mot de andra metoderna J�mf�relseoperatorn fungerar inte i nul�get
	public long compute2Power(int power) {
		if(power < 0) {
			throw new IllegalArgumentException();
		}
		else{
			if(getValueFromMemory(power) == null) {
				addValueToMemory(power, computePower(power));
				//Testrad ta bort!
				System.out.println("Nu l�ggs v�rdet till minnet");
				return getValueFromMemory(power);
				
			}
			else {
				return getValueFromMemory(power);
			}
		}
	}
	
}
