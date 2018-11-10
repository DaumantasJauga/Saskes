package saskes;

import java.util.Scanner;

public class GameEngine {
	boolean turn = true;
	Player player = new Player();
	Map map = new Map();
	GameRules rules = new GameRules(map);
	
	GameEngine(){
	System.out.println("Sveiki atvykę į šaškių turnyrą iki mirties");
	play();
	}
	
	public void play() {
		if (turn==true) System.out.println("----Baltųjų eilė----");
		else System.out.println("----Juodųjų eilė----");
		askForInput(player);
		process(player);
		turn = !turn;
		play();
	}
	
	public void process(Player player) {
		if ((rules.isSpotAvailable(player.getX2(), player.getY2())) &&		
			((rules.canCheckerMove(turn, player.getX1(), player.getX2(), player.getY1(), player.getY2())==true
					|| (rules.canCheckerKill(turn, player.getX1(), player.getX2(), player.getY1(), player.getY2())==true)))) {
			map.changeMap(player.getX1(), player.getX2(), player.getY1(), player.getY2(), player.getValue());
		}
		else {
			System.out.println("Įvyko klaidelė, skambinkit žaidimo kūrėjams");
		}
		player.changeValue(turn);
		rules.isGameOver();
	}

	
	public void askForInput(Player player) {
		System.out.println("IŠ");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		player.setX1(scan.nextInt());
		player.setY1(scan.nextInt());
		System.out.println("Į");
		player.setX2(scan.nextInt());
		player.setY2(scan.nextInt());
	}
}
