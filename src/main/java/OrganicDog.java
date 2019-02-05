
public class OrganicDog  extends Dog implements OrganicPetTasks{
	
	private int hungerLevel;
	private int thirstLevel;
	private int cageCleanliness;
	private int wasteLevel;
	

	public OrganicDog(String name, int healthLevel, int happinessLevel, String description, int hungerLevel,
			int thirstLevel, int cageCleanliness, int wasteLevel) {
		super(name, healthLevel, happinessLevel, description);
		
	this.hungerLevel = hungerLevel;
	this.thirstLevel = thirstLevel;
	this.cageCleanliness = cageCleanliness;
	this.wasteLevel = wasteLevel;
		
	}
		
	//getters for organic dogs
	
	public int getHungerLevel() {
		return hungerLevel;
	}
	
	public int getThirstLevel() {
		return thirstLevel;
	}
	
	public int getCageCleanliness() {
		return cageCleanliness;
	}
	
	public int getWasteLevel() {
		return wasteLevel;
	}
	
	//organic dog behaviors
	
	public void cleanCage() {
		cageCleanliness += 100;
		healthLevel += 25;
	}
	
	
	//organic behaviors

	@Override
	public void feed() {
		hungerLevel -= 25;
		
	}


	@Override
	public void water() {
		thirstLevel -=25;
		
	}

	//the tick represents passage of time and returns cage waste level
	
	@Override
	public int tick() {
		healthLevel -= 2;
		happinessLevel -= 2;
		hungerLevel -= 2;
		thirstLevel += 2;
		cageCleanliness -= 5;
		return wasteLevel += 5;
		
		
		
	}

}
