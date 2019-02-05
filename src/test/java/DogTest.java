import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DogTest {
	
	OrganicDog dog = new OrganicDog("Jax", 0, 0, "brown", 0, 0, 0, 0);
	
	@Test
	public void should_Be_Able_To_Walk_Organic_Dog() {
		dog.walk();
		assertEquals(25, dog.getHealthLevel());
		assertEquals(50, dog.getHappinessLevel());
	}
	
	@Test
	public void should_Be_Able_To_Feed_Dog() {
		dog.feed();
		assertEquals(-25, dog.getHungerLevel());
	}
	
	@Test
	public void should_Be_Able_To_Water_Dog() {
		dog.water();
		assertEquals(-25, dog.getThirstLevel());
	}
	
	@Test
	public void should_Be_Able_To_Clean_Cage() {
		dog.cleanCage();
		assertEquals(100, dog.getCageCleanliness());
	}

}
