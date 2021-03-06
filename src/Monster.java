import java.util.Scanner;

public class Monster extends Character {
	
	/**
	 * Genera un monstruo pasandole todos sus par�metros
	 * @param name
	 * @param hp
	 * @param attack
	 * @param defense
	 * @param extraDefense
	 */
	public Monster (String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
	}
	/**
	 * Genera un monstruo sin par�metros, generados autom�ticamente
	 */
	public Monster () {
		super();
	}
	
	/**
	 * El Monstruo muere y da la opci�n al heroe de buscar objetos
	 */
	public void die (Character character) {
		Hero hero = (Hero)character;
		System.out.println("Has derrotado al monstruo!");
		
		System.out.println("Quieres ver si el monstruo lleva alg�n objeto consigo? (si/no)");
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		
		if (answer.equalsIgnoreCase("si")) {
			
			hero.searchItems(this);
		}
		input.close();
	}
}
