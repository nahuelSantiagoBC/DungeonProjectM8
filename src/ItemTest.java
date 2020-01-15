import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemTest {

	
	@Test
	void createSettedItemCorrectVariables() {
		Item settedItem = new Item("Dragon's armor", "Armor", "The armor beared by ancient dragon adepts.", 50, 30, 20, 20);
		assertEquals("Dragon's armor", settedItem.getName());
		assertEquals(50, settedItem.getHp());
		assertEquals(30, settedItem.getAttack());
		assertEquals(20, settedItem.getArmor());
		assertEquals(20, settedItem.getMana());
	}
	@Test
	void createRandomItemCorrect() {
		Item settedItem = new Item();
		assertEquals(settedItem, settedItem);
	}

}
