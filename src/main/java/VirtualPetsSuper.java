
public abstract class VirtualPetsSuper {

	protected String name;
	protected int healthLevel;
	protected int happinessLevel;
	protected String description;

	public VirtualPetsSuper() {
		super();
	}

	public String getName() {
		return name;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public int getHappinessLevel() {
		return happinessLevel;
	}
	
	public String getDescription() {
		return description;
	}

	public void play() {
		happinessLevel = happinessLevel +35;
		healthLevel = healthLevel +5;
	}
	
	
	public abstract int tick();
		
		
				
				
	
	
	
	
	
	
}