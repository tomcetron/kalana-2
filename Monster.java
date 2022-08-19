package cviceni7;

import java.util.Random;

public class Monster {
	
	private String name;
	private int level;
	private int dmg; // zpusobuje poskozeni
	private int hp;
	private int count;
	
	
	public Monster(String name, int level, int dmg, int hp, int count) {
		super();
		this.name = name;
		this.level = level;
		this.dmg = dmg;
		this.hp = hp;
		this.count = count;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	@Override
	public String toString() {
		return "Prisera " + name + " na urovni " + level + " a v poctu: " + count + ", ";
	}
	
	public void attack(Player player) {
		Random rnd = new Random();
		int attackDmg = 0; 
		
		for (int i = 0; i < count; i++) {
			attackDmg += dmg + rnd.nextInt(8) + 1;
		}
		
		player.setHp(player.getHp() - attackDmg);
	
	}

}
