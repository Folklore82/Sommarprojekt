import java.util.HashMap;

public class TestModel {
	//Minnes-Hashmapen
	HashMap<Integer, Long> memory = new HashMap<Integer, Long>();
	
	//metod för att hämta värde från Hashmapen från
	private Long getValueFromMemory(Integer number) {
		return memory.get(number);
	}
	
	//Metod för att lägga in värden i Hashmapen. Den ska egentligen vara PRIVATE!
	private void addValueToMemory(Integer value, Long result) {
		memory.put(value, result);
	}
	//Tömmer minnet
	public void clearMemory() {
		memory.clear();
	}
	//Utför beräkningen
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
	//Tar ett värde och kör det mot de andra metoderna Jämförelseoperatorn fungerar inte i nuläget
	public long compute2Power(int power) {
		if(power < 0) {
			throw new IllegalArgumentException();
		}
		else{
			if(getValueFromMemory(power) == null) {
				addValueToMemory(power, computePower(power));
				//Testrad ta bort!
				System.out.println("Nu läggs värdet till minnet");
				return getValueFromMemory(power);
				
			}
			else {
				return getValueFromMemory(power);
			}
		}
	}
	
}
