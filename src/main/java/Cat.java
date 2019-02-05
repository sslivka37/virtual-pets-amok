
public abstract class Cat extends VirtualPetsSuper  {
	

	// loaded constructors

	public Cat(String name,  int healthLevel, int happinessLevel, String description) {
		this.name = name;		
		this.healthLevel = healthLevel;		
		this.happinessLevel = happinessLevel;
		this.description = description;
		
	}

	//getters for cats
	public String getName() {
		return name;
	}

	public int getHealthLevel() {
		return healthLevel;
	}
	
	public int getHappinessLevel() {
		return happinessLevel;
	}
		

	


}
