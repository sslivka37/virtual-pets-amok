import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboDogTest {
	
	RoboDog roboDog = new RoboDog("Zippy", 0, 0, "has bolts");
	
	@Test
	public void should_Be_Able_To_Play_With_Robodog() {
		roboDog.play();
		assertEquals(35, roboDog.getHappinessLevel());		
		
	}
	
	@Test
	public void should_Be_Able_To_Give_Robodog_Oil() {
		roboDog.giveOil();
		assertEquals(25, roboDog.getHealthLevel());
	}

}
