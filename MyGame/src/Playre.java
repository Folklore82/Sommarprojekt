
public class Playre {
	
	private int hp = 100;
	private int mp = 100;
	private int mpPotions = 3;
	private int hpPotions = 3;
	private boolean isDead = false;
	
	public void attack() {
		if ( !isDead) {
			if (mp >= 25) {
				mp -= 25;
				System.out.println("Attacking!");
			}
			else {
				System.out.println("Not enough MP");
			}
		}
		else {
			System.out.println("You are dead, you cant attack");
		}
	}
	
	public void takeDamage() {
		hp -= 25;
		if (hp <= 0) {
			System.out.println("You died");
			isDead = true;
		}
		else {
			System.out.println("You took damage");
		}
	}
	
	public void useHpPotion() {
		if (hpPotions > 0) {
			System.out.println("You drank a hp potion");
			hpPotions --;
			hp += 100;
		}
		else {
			System.out.println("Not enough HP potions");
		}
	}
	
	public void useMpPotion() {
		if (mpPotions > 0) {
			System.out.println("You drank a MP potion");
			mpPotions --;
			mp += 100;
		}
		else {
			System.out.println("Not enough MP potions");
		}
	}

}
