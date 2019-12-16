import java.util.Scanner;

import javax.swing.JOptionPane;

public class Hero extends Character {

	//m�todos
	public void searchItems(Character target) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		
		if (target.getInventory() == null) {
			System.out.println("Este monstruo no lleva ningun objeto con �l");
		}
		else {
			System.out.println("El monstruo lleva un objeto con �l.");
			Item item = this.getInventory();
			item.toString();
			System.out.println("Quieres cambiarlo por tu objeto? (si/no)");
			
			respuesta = teclado.nextLine();
			
			if (respuesta.equalsIgnoreCase("si")) {
				this.saveItem(item);
			}
		}
		if(target.getInventory() != null) {
			saveItem(target.getInventory());
		}
		
	}
	
	public void saveItem(Item item) {
		this.setInventory(item);
		System.out.println("Objeto equipado.");
	}

	public void die(Hero heroe) {
		
	}
	
}