import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboCatTest {

	RoboCat roboCat = new RoboCat("Sparky", 0, 0, "clangs");
	
	@Test
	public void should_Be_Able_To_Play_With_Robocat() {
		roboCat.play();
		assertEquals(35, roboCat.getHappinessLevel());
	}
	
	@Test
	public void should_Be_Able_To_Oil_Robocat() {
		roboCat.giveOil();
		assertEquals(50, roboCat.getHealthLevel());
		
	}

}
