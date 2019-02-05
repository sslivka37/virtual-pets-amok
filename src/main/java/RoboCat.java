
public class RoboCat extends Cat implements RoboticPetTasks  {

	public RoboCat(String name, int healthLevel, int happinessLevel, String description) {
		super(name, healthLevel, happinessLevel, description);
		
	}

	
	@Override
	public void giveOil() {
		healthLevel += 50;
		
	}


	//for robocats, tick passes time but also returns the overall health of robotic pets
	
	@Override
	public int tick() {
		
		happinessLevel -= -2;
		return healthLevel -= 2;
		
	}
	

	
}
