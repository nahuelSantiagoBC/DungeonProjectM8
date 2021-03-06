import java.util.Scanner;

import javax.swing.JOptionPane;

public abstract class Hero extends Character {

	//m�todos
	
	
	
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hero(String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
		// TODO Auto-generated constructor stub
	}

	/**
	 * M�tode per buscar objectes en el cadaver d'un monstre
	 * @param Monstre objectiu
	 */
	public void searchItems(Monster target) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		
		if (target.getInventory() == null) {
			System.out.println("Este monstruo no lleva ningun objeto con �l");
		}
		else {
			System.out.println("El monstruo lleva un objeto con �l.");
			Item item = target.getInventory();
			System.out.println(item.toString());
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
	
	/**
	 * M�tode per equiparte un objecte.
	 * @param item
	 */
	public void saveItem(Item item) {
		this.setInventory(item);
		System.out.println("Objeto equipado.");
	}

	/**
	 * M�tode per marcar el final del joc
	 */
	public void die(Character character) {
		System.out.println("Final del Joc");
	}
	
}