import java.util.Scanner;

public class Monster extends Character {
	
	/**
	 * Genera un monstruo pasandole todos sus parámetros
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
	 * Genera un monstruo sin parámetros, generados automáticamente
	 */
	public Monster () {
		super();
	}
	
	/**
	 * El Monstruo muere y da la opción al heroe de buscar objetos
	 */
	public void die (Character character) {
		Hero hero = (Hero)character;
		System.out.println("Has derrotado al monstruo!");
		
		System.out.println("Quieres ver si el monstruo lleva algún objeto consigo? (si/no)");
		Scanner teclado = new Scanner(System.in);
		String respuesta = teclado.nextLine();
		
		if (respuesta.equalsIgnoreCase("si")) {
			
			hero.searchItems(this);
		}
		
	}
}
