
public abstract class Dog extends VirtualPetsSuper {

	
		
	//loaded constructor

	public Dog(String name,  int healthLevel, int happinessLevel, String description) {
		this.name = name;		
		this.healthLevel = healthLevel;
		this.happinessLevel = happinessLevel;
		this.description = description;
		
	}

	//getters for dog
	
	public String getName() {
		return name;
	}

	public int getHealthLevel() {
		return healthLevel;
	}
	
	public int getHappinessLevel() {
		return happinessLevel;
	}


	//dog behaviors
	
	public void walk() {
		healthLevel = healthLevel + 25;
		happinessLevel = happinessLevel + 50;
	}

	
	



}
