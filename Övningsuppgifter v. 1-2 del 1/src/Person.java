
public class Person {
	private String name;
	private String occupation;
	private int age;
	private String sex;
	private int length;
	public House house;
	
	public void personConstructor(String name, String occupation, int age, String sex, int length, House house) {
		this.name = name;
		this.occupation = occupation;
		if(age > 0 && age < 100) {
			this.age = age;
		}else {
			this.age = 20;
		}
		this.sex = sex;
		this.length = length;
		this.house = house;
	}
	
	public void personPrinter() {
		System.out.println("Jag heter "+name+" och är " + age+ " år gammal.");
		System.out.println("Jag arbetar som "+occupation+" och definierar mig som "+sex+".");
		System.out.println("Tilläggas kan av någon anledning att jag är "+length+" cm lång.");
		System.out.println("Jag bor i följande hus:"+house.adress);
		System.out.println("Jag kör en "+ house.car.model);
	}

	

}
