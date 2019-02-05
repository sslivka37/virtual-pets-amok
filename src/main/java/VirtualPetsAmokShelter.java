import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetsAmokShelter {

	Map<String, VirtualPetsSuper> virtualPets = new HashMap<>();

	public Collection<VirtualPetsSuper> getAllPets() {
		return virtualPets.values();
	}

	public VirtualPetsSuper findPet(String petName) {
		return virtualPets.get(petName);
	}

	public void addPet(VirtualPetsSuper pets) {
		virtualPets.put(pets.getName(), pets);

	}

	public void remove(VirtualPetsSuper pets) {
		virtualPets.remove(pets.getName(), pets);

	}

	public void play(String petName) {
		VirtualPetsSuper playWithPet = findPet(petName);
		playWithPet.play();
	}

	public void feedOrganicPets() {
		for (VirtualPetsSuper currentPet : virtualPets.values()) {
			if (currentPet instanceof OrganicPetTasks) {
				((OrganicPetTasks) currentPet).feed();
			}
		}
	}

	// can also do it this way, by creating an instance of OrganicPetTasks and then
	// invoking the method
	// OrganicPetTasks organicPet = (OrganicPetTasks) currentPet;
	// organicPet.feed();

	// one last alternative
	// Collection<OrganicPetTasks> virtualPets.stream().filter(pet=>pet instanceOf
	// OragincPetTasks);

	public void waterOrganicPets() {
		for (VirtualPetsSuper currentPet : virtualPets.values()) {
			if (currentPet instanceof OrganicPetTasks) {
				((OrganicPetTasks) currentPet).water();
			}
		}

	}

	public void oilRoboticPets() {
		for (VirtualPetsSuper currentPet : virtualPets.values()) {
			if (currentPet instanceof RoboticPetTasks) {
				((RoboticPetTasks) currentPet).giveOil();
			}
		}
	}

	public void walkAllDogs() {
		for (VirtualPetsSuper currentPet : virtualPets.values()) {
			if (currentPet instanceof Dog) {
				((Dog) currentPet).walk();
			}
		}

	}

	public void cleanCages() {
		for (VirtualPetsSuper currentPet : virtualPets.values()) {
			if (currentPet instanceof OrganicDog) {
				((OrganicDog) currentPet).cleanCage();

			}
		}
	}

	public void cleanAllLitterboxes() {
		for (VirtualPetsSuper currentPet : virtualPets.values()) {
			if (currentPet instanceof OrganicCat) {
				((OrganicCat) currentPet).cleanLitterBox();
			}
		}

	}

	public void tickAllPets() {
		for (VirtualPetsSuper currentPet : virtualPets.values()) {
			currentPet.tick();
		}

	}

}
