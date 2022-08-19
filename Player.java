package cviceni7;

import java.util.Random;

public class Player {
	
	private String name;
	private int level;
	private int dmg; // zpusobuje poskozeni
	private int hp; // a sam ma nejake zdravi
	
	public Player(String name, int level, int dmg, int hp) {
		this.name = name;
		this.level = level;
		this.dmg = dmg;
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Hrac " + name + " na urovni: " + level + " ";
	}
	
	public void attack(Monster monster) {
		Random rnd = new Random();
		int attackDmg = dmg + rnd.nextInt(8) + 1;
		monster.setHp(monster.getHp() - attackDmg);
	}

	
}