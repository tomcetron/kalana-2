package cviceni7;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player("Geralt", 5, 22 , 100);
		Monster monster = new Monster("Kikimora", 5, 8, 50, 5);
		
		
		System.out.println(player);
		System.out.println(monster);
		
		System.out.println("-------------------");
		 
		// samotna simulace ÚTOKU
		do {
			player.attack(monster);
			
			if(monster.getHp() <= 0) {
				break;
			}
			monster.attack(player); 
			
			if(player.getHp() <= 0) {
				break;
			}
			
			
			
		} while (player.getHp() > 0 && monster.getHp() > 0);
		
		  System.out.println("--------------------");
		
		// kdo vyhral??
		  if(player.getHp() <= 0 && monster.getHp() <= 0) {
			  System.out.println("Souboj nikdo neprezil.");
		  } else if(player.getHp() <= 0) {
			  System.out.println(monster + " vyhrala a zbylo ji jeste " + monster.getHp() + " zivotu.");
		  } else {
			  System.out.println(player + "Geralt vyhral a zbylo mu " + player.getHp() + " zivotu.");
		  }
		
		
	}

}