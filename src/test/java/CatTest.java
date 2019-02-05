import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest {
	OrganicCat cat = new OrganicCat("Lincoln", 0, 0, "fluffy", 0, 0, 0, 0);
	

	
	
	
	@Test
	public void should_Be_Able_To_Feed_Cat() {
		cat.feed();
		assertEquals(-25, cat.getHungerLevel());
	}
	
	@Test
	public void should_Be_Able_To_Water_Cat() {
		cat.water();
		assertEquals(-25, cat.getThirstLevel());
	}
	
	@Test
	public void should_Be_Able_To_Clean_Litterbox() {
		cat.cleanLitterBox();
		assertEquals(100, cat.getLitterBoxCleanlinesss());
	}
	
	@Test
	public void should_Be_Able_To_Play_With_Cat() {
		cat.play();
		assertEquals(35, cat.getHappinessLevel());
	}

}
