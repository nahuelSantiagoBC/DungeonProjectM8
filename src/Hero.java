import javax.swing.JOptionPane;

public class Hero extends Character {

	//métodos
	public void searchItems(Character target) {
		
		if(target.getInventory() != null) {
			saveItem(target.getInventory());
		}
		
	}
	
	private void saveItem(Item item) {
		
		//le mostramos al jugador el item que ha encontrado
	}
	
}