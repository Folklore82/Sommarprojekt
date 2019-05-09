
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
		System.out.println("Jag heter "+name+" och �r " + age+ " �r gammal.");
		System.out.println("Jag arbetar som "+occupation+" och definierar mig som "+sex+".");
		System.out.println("Till�ggas kan av n�gon anledning att jag �r "+length+" cm l�ng.");
		System.out.println("Jag bor i f�ljande hus:"+house.adress);
		System.out.println("Jag k�r en "+ house.car.model);
	}

	

}
