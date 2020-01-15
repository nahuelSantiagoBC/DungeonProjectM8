import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MageTest {

	@Test
	void AlCrearUnMagSenseParametresHaDeGenerarse() {
		Mage mago = new Mage();
		assertEquals(mago, mago);
	}
	@Test
	void AlCrearUnMagAmbParametresElsParametresHanDeCuadrar() {
		Mage mago = new Mage("Raul", 350, 150, 200, 100);
		assertEquals("Raul",mago.getName());
		assertTrue(mago.getHp() >= Character.MAX_HP_MINIMUM);
		assertTrue(mago.getHp() <= Character.MAX_HP_LIMIT);
		assertTrue(mago.getAttack() >= Character.ATTACK_MINIMUM);
		assertTrue(mago.getAttack() <= Character.ATTACK_LIMIT);
		assertTrue(mago.getDefense() >= Character.DEFENSE_MINIMUM);
		assertTrue(mago.getDefense() <= Character.DEFENSE_LIMIT);
		assertTrue(mago.getMP() >= Mage.MAX_MP_MINIMUM);
		assertTrue(mago.getMP() <= Mage.MAX_MP_LIMIT);
	}
	@Test
	void AlAtacarAUnAltreMagLaVidaHaDeBaixarCorrectament() {
		Mage mago = new Mage("Raul", 350, 400, 200, 100);
		Mage mago2 = new Mage("Raul", 400, 70, 100, 100);
		
		mago.attack(mago2);
		assertEquals(200,mago2.getHp());
	}
	@Test
	void AlAtacarAUnAltreMagIModificarElsValorsANegatiusElDamageSera0() {
		Mage mago = new Mage("Raul", 350, 400, 200, 100);
		Mage mago2 = new Mage("Raul", 400, 70, 100, 100);
		
		mago.setName("Pepe");
		mago.setAttack(300);
		mago.setDefense(200);
		mago.setHp(500);
		mago.setMaxHp(500);
		mago.setMP(70);
		mago.setMaxMP(70);
		
		mago.attack(mago2);
		assertEquals(250,mago2.getHp());
		
	}
	@Test
	void AlModificarElMagIUtilitzarUnEncanteriLaVidaHaDeBaixar() {
		Mage mago = new Mage("Raul", 350, 400, 200, 100);
		Mage mago2 = new Mage("Raul", 400, 70, 100, 100);
		
		mago.setSpellDescription("Cura a tus aliados(?");
		mago.setSpellName("Heal");
		mago.useSpell(mago2);
		assertEquals(300,mago2.getHp());
		assertEquals("Cura a tus aliados(?",mago.getSpellDescription());
		assertEquals("Heal",mago.getSpellName());
	}
	@Test
	void AllluitarelsMagsHaDeMorirUn() {
		Mage mago = new Mage("Raul", 350, 400, 200, 100);
		Mage mago2 = new Mage("Raul", 10, 70, 100, 100);
		
		mago.attack(mago2);
		assertTrue(mago2.getHp() <= 0);
		
	}
	@Test
	void AllluitarelsMagsPeroEsDefenHaDeBaixarMenysVida() {
		Mage mago = new Mage("Raul", 350, 400, 200, 100);
		Mage mago2 = new Mage("Raul", 10, 70, 100, 100);
		
		mago.defend();
		mago2.attack(mago);
		mago.getExtraDefense();
		
		// 23 and 17,5
		
		assertTrue(mago.getHp() > 327);
	}
	@Test
	void luchaMagoyWarriorCorrecta() {
		Mage mago = new Mage("Raul", 350, 400, 200, 100);
		Warrior warrior = new Warrior("Pepe", 300, 70, 100);
		
		mago.defend();
		warrior.attack(mago);
		mago.attack(warrior);
		
		assertTrue(mago.getHp() < 400);
		assertTrue(warrior.getHp() < 300);
	}
	

}
