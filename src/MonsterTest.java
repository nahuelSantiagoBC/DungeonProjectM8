import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonsterTest {

	@Test
	void MonsterTest() {
		Warrior monsterSlayer = new Warrior();
		Monster randomMonster = new Monster();
		randomMonster.die(monsterSlayer);
	}

}
