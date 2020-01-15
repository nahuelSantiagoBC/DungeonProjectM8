import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonsterTest {

	/*
	 * @Test void MonsterTest() { Warrior monsterSlayer = new Warrior(); Monster
	 * randomMonster = new Monster(); randomMonster.die(monsterSlayer); Monster
	 * settedMonster = new Monster("Dragon", 500, 300, 200);
	 * randomMonster.die(monsterSlayer); }
	 */
	
	@Test
	void createSettedMonsterCorrectVariables() {
		Monster settedMonster = new Monster("Dragon", 500, 300, 200);
		assertEquals("Dragon", settedMonster.getName());
		assertEquals(500, settedMonster.getHp());
		assertEquals(300, settedMonster.getAttack());
		assertEquals(200, settedMonster.getDefense());
		assertEquals((int)(200*0.50), settedMonster.getExtraDefense());
	}
	
	@Test
	void createRandomMonsterValidRange() {
		Monster randomMonster = new Monster();
		System.out.println(randomMonster.getHp() + " " + randomMonster.getAttack() + " " + randomMonster.getDefense());
		assertTrue(randomMonster.getHp() >= Character.MAX_HP_MINIMUM);
		assertTrue(randomMonster.getHp() <= Character.MAX_HP_LIMIT);
		assertTrue(randomMonster.getAttack() >= Character.ATTACK_MINIMUM);
		assertTrue(randomMonster.getAttack() <= Character.ATTACK_LIMIT);
		assertTrue(randomMonster.getDefense() >= Character.DEFENSE_MINIMUM);
		assertTrue(randomMonster.getDefense() <= Character.DEFENSE_LIMIT);
	}
	
	@Test
	//void monsterDies() {
		//Warrior monsterSlayer = new Warrior();
		//Monster randomMonster = new Monster();
		//randomMonster.die(monsterSlayer);
	//}
	
	void monsterDiesWithObject() {
		Warrior monsterSlayer = new Warrior();
		Monster randomMonster = new Monster();
		Item randomitem = new Item();
		randomMonster.setInventory(randomitem);
		randomMonster.die(monsterSlayer);
	}

}
