
public class OrganicCat extends Cat implements OrganicPetTasks {

	private int hungerLevel;
	private int thirstLevel;
	private int litterBoxCleanliness;
	private int wasteLevel;

	public OrganicCat(String name, int healthLevel, int happinessLevel, String description, int hungerLevel,
			int thirstLevel, int litterBoxCleanliness, int wasteLevel) {
		super(name, healthLevel, happinessLevel, description);
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;

	}

	// getters for Organic Cats

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {

		return thirstLevel;
	}

	public int getLitterBoxCleanlinesss() {
		return litterBoxCleanliness;
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	// organic cat behaviors

	public void cleanLitterBox() {
		litterBoxCleanliness += 100;
		healthLevel += 25;
	}

	// organic behaviors

	@Override
	public void feed() {
		hungerLevel -= 25;

	}

	@Override
	public void water() {
		thirstLevel -= 25;

	}

	// tick represents passage of time but also returns the waste level of the
	// litter box

	@Override
	public int tick() {
		healthLevel -= 2;
		happinessLevel -= 2;
		hungerLevel += 2;
		thirstLevel += 2;
		litterBoxCleanliness -= 5;
		return wasteLevel += 5;

	}

}
