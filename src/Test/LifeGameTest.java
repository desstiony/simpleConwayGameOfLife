package Test;

import static org.junit.Assert.assertEquals;
import game.LifeGame;

import org.junit.Test;

public class LifeGameTest {
	@Test
	public void testOk() {
		assertEquals(1, 1);
	}
	
	@Test
	public void testLifeGame(){
		LifeGame lifeGame = new LifeGame();
		char[][] cell = new char[30][60];
		lifeGame.setCell(cell);
		lifeGame.nextCell();
		char[][] nextCell = lifeGame.getCell();
		assertEquals(' ', nextCell[0][0]);
	}
}
