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
	public Monster (String name, int hp, int attack, int defense, int extraDefense) {
		super();
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
	public void die (Character heroe) {
		System.out.println("Has derrotado al monstruo!");
		
		System.out.println("Quieres ver si el monstruo lleva alg�n objeto consigo? (si/no)");
		Scanner teclado = new Scanner(System.in);
		String respuesta = teclado.nextLine();
		
		if (respuesta.equalsIgnoreCase("si")) {
			
			heroe.searchItems(this);
		}
		
	}
	/**
	 * El monstruo no puede buscar objetos, esto no hace nada, pero es necesario implementarlo
	 */
	public void searchItems(Monster monster) {
		
		
	}
}
