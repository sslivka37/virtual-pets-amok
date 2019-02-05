import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;


public class ShelterTest {
	
	
		
		VirtualPetsAmokShelter shelter;
		OrganicCat cat1;
		OrganicDog dog1;
		RoboCat cat2;
		RoboDog dog2;
		
		@Before
		public void setUp() {
			shelter = new VirtualPetsAmokShelter();
			cat1 = new OrganicCat("Lincoln", 0, 0, "orange", 0, 0, 0, 0);
			dog1 = new OrganicDog("Jax", 0, 0, "brown", 0, 0, 0, 0);
			cat2 = new RoboCat("Homer", 0, 0, "gray");
			dog2 = new RoboDog("Marla", 0, 0, "noisy");
			
		}
		
		@Test
		public void should_Be_Able_To_Pet() {
			shelter.addPet(cat1);
			Collection<VirtualPetsSuper> check = shelter.getAllPets();
			assertThat (check, contains(cat1));
		}
		
		@Test
		public void should_Be_Able_To_Add_Different_Pets() {
			shelter.addPet(cat1);
			shelter.addPet(dog1);
			Collection<VirtualPetsSuper> check = shelter.getAllPets();
			assertEquals(2, check.size());
		}
		
		
		@Test
		public void should_Be_Able_To_Remove_Pet() {
			shelter.addPet(cat2);
			shelter.remove(cat2);
			Collection<VirtualPetsSuper> check = shelter.getAllPets();
			assertEquals(0, check.size());
			
		}
		
		@Test
		public void should_Be_Able_To_Select_Pet_And_Play() {
			shelter.addPet(dog2);
			shelter.play(dog2.getName());
			assertEquals(35, dog2.getHappinessLevel());
		}
		
		@Test
		public void should_Be_Able_To_Feed_Organic_Pets() {
			shelter.addPet(cat1);
			shelter.addPet(dog1);
			shelter.feedOrganicPets();
			assertEquals(-25, cat1.getHungerLevel());
			assertEquals(-25, dog1.getHungerLevel());
			
		}
		
		@Test
		public void should_Be_Able_to_Water_Organic_Pets() {
			shelter.addPet(cat1);
			shelter.addPet(dog1);
			shelter.waterOrganicPets();
			assertEquals(-25, cat1.getThirstLevel());
			assertEquals(-25, dog1.getThirstLevel());	
			
		}
		
		
		@Test
		public void should_Be_Able_To_Oil_Robotic_Pets() {
			shelter.addPet(dog2);
			shelter.addPet(cat2);
			shelter.oilRoboticPets();
			
		}
		
		@Test
		public void should_Be_Able_To_Walk_All_Dogs() {
			shelter.addPet(dog1);
			shelter.addPet(dog2);
			shelter.walkAllDogs();
			assertEquals(50, dog1.getHappinessLevel());
			assertEquals(50, dog2.getHappinessLevel());
		}
		
		@Test
		public void should_Be_Able_To_Clean_All_Org_Dog_Cages() {
			shelter.addPet(dog1);
			shelter.cleanCages();
			assertEquals(100, dog1.getCageCleanliness());
			
		}
		
		@Test
		public void should_Be_Able_To_Clean_All_Org_Cat_Litterboxes() {
			shelter.addPet(cat1);
			shelter.cleanAllLitterboxes();
			assertEquals(100, cat1.getLitterBoxCleanlinesss());
			
		}
		
		@Test
		public void should_Be_Able_To_Pass_Time() {
			shelter.addPet(cat1);
			shelter.addPet(cat2);
			shelter.tickAllPets();
			assertEquals(5, cat1.getWasteLevel());
			assertEquals(-2, cat2.getHealthLevel());
		}
		

}





