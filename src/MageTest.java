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
		Mage mago = new Mage("Raul", 350, 400, 200, 100);
		assertEquals("Raul",mago.getName());
		assertEquals(350, mago.getHp());
		assertEquals(350, mago.getMaxHp());
		assertEquals(400, mago.getAttack());
		assertEquals(200, mago.getDefense());
		assertEquals(100, mago.getMP());
		assertEquals(100, mago.getMaxMP());
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
	

}
