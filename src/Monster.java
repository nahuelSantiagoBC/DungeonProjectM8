import java.util.Scanner;

public class Monster extends Character {
	
	public Monster (String name, int hp, int attack, int defense, int extraDefense) {
		super();
	}
	public Monster () {
		super();
	}
	
	public void die (Character heroe) {
		System.out.println("Has derrotado al monstruo!");
		
		System.out.println("Quieres ver si el monstruo lleva algún objeto consigo? (si/no)");
		Scanner teclado = new Scanner(System.in);
		String respuesta = teclado.nextLine();
		
		if (respuesta.equalsIgnoreCase("si")) {
			
			heroe.searchItems(this);
		}
		
	}
	public void searchItems(Monster monster) {
		
		
	}
}
