import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetsAmokShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetsAmokShelter shelter = new VirtualPetsAmokShelter();
		OrganicCat organicCat1 = new OrganicCat("Chonker", 25, 25, "is a big boy", 30, 15, 25, 40);
		OrganicCat organicCat2 = new OrganicCat("Dex", 15, 10, "likes to go outside", 20, 40, 10, 10);
		RoboCat roboCat1 = new RoboCat("Lincoln", 10, 10, "is a little squeaky");
		RoboCat roboCat2 = new RoboCat("Homer", 20, 20, "is a scrappy one");
		OrganicDog organicDog1 = new OrganicDog("Jax", 10, 10, "loves everyone", 10, 10, 10, 10);
		OrganicDog organicDog2 = new OrganicDog("Marla", 20, 20, "loves to splash water", 20, 20, 20, 20);
		RoboDog roboDog1 = new RoboDog("Ratchet", 40, 40, "is very shiny");
		RoboDog roboDog2 = new RoboDog("Clank", 20, 20, "beeps a lot");

		shelter.addPet(organicCat1);
		shelter.addPet(organicCat2);
		shelter.addPet(roboCat1);
		shelter.addPet(roboCat2);
		shelter.addPet(organicDog1);
		shelter.addPet(organicDog2);
		shelter.addPet(roboDog1);
		shelter.addPet(roboDog2);

		// Mapping out the pets for the play/adopt methods
		Map<String, VirtualPetsSuper> currentPets = new HashMap<>();
		for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
			currentPets.put(eachPet.getName(), eachPet);
		}

		System.out.println("Welcome to Sarah's pet shelter, where all forms of life are welcome!");
		System.out.println("Here are our adoptable organic cats:");

		for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
			if (eachPet instanceof OrganicCat) {
				System.out.println("\tName: " + ((OrganicCat) eachPet).getName() + "\tHealth Level: "
						+ ((OrganicCat) eachPet).getHealthLevel() + "\tHunger Level: "
						+ ((OrganicCat) eachPet).getHungerLevel() + "\tThirst Level: "
						+ ((OrganicCat) eachPet).getThirstLevel() + "\tHappiness Level: "
						+ ((OrganicCat) eachPet).getHappinessLevel() + "\tLitterbox Cleanliness: "
						+ ((OrganicCat) eachPet).getLitterBoxCleanlinesss());
			}

		}

		System.out.println("Here are our adoptable robotic cats:");
		for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
			if (eachPet instanceof RoboCat) {
				System.out.println("\tName: " + ((RoboCat) eachPet).getName() + "\tHealth Level: "
						+ ((RoboCat) eachPet).getHealthLevel() + "\tHappiness Level: "
						+ ((RoboCat) eachPet).getHappinessLevel());
			}
		}
		System.out.println("Here are our adoptable organic dogs:");
		for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
			if (eachPet instanceof OrganicDog) {
				System.out.println("\tName: " + ((OrganicDog) eachPet).getName() + "\tHealth Level: "
						+ ((OrganicDog) eachPet).getHealthLevel() + "\tHunger Level: "
						+ ((OrganicDog) eachPet).getHungerLevel() + "\tThirst Level: "
						+ ((OrganicDog) eachPet).getThirstLevel() + "\tHappiness Level: "
						+ ((OrganicDog) eachPet).getHappinessLevel() + "\tCage Cleanliness: "
						+ ((OrganicDog) eachPet).getCageCleanliness());
			}
		}

		System.out.println("Here are our adoptable robotic dogs:");
		for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
			if (eachPet instanceof RoboDog) {
				System.out.println("\tName: " + ((RoboDog) eachPet).getName() + "\tHealth Level: "
						+ ((RoboDog) eachPet).getHealthLevel() + "\tHappiness Level: "
						+ ((RoboDog) eachPet).getHappinessLevel());
			}
		}

		// giving menu option

		System.out.println(
				"What would you like to do with the animals? \nPress 1 to feed all organic pets \nPress 2 to give all organic pets water"
						+ "\nPress 3 to walk all dogs \nPress 4 to clean all organic cat litterboxes \nPress 5 to clean all organic dog cages "
						+ "\nPress 6 to oil all robotic pets \nPress 7 to play with a pet \nPress 8 to admit a pet \nPress 9 to adopt a pet"
						+ "\nPress 10 to see the statuses of all pets again \nPress any other number to leave the shelter");
		int userMenuSelect = Integer.parseInt(input.nextLine());

		// game loop

		while (userMenuSelect >= 1 && userMenuSelect <= 10) {
			switch (userMenuSelect) {
			case 1:
				System.out.println("You feed all of the organic pets.");
				shelter.feedOrganicPets();
				shelter.tickAllPets();
				break;

			case 2:
				System.out.println("You give all of the organic pets water.");
				shelter.waterOrganicPets();
				shelter.tickAllPets();
				break;

			case 3:
				System.out.println("You take the organic and robotic dogs for a walk! Bork bork!");
				shelter.walkAllDogs();
				shelter.tickAllPets();
				break;

			case 4:
				System.out.println("You empty all of the cats' litterboxes. Pee-yew!");
				shelter.cleanAllLitterboxes();
				shelter.tickAllPets();
				break;

			case 5:
				System.out.println("You clean all of the dogs' cages. No more turds here!");
				shelter.cleanCages();
				shelter.tickAllPets();
				break;

			case 6:
				System.out.println("You've oiled all of the robotic pets, they squeak a little less.");
				shelter.oilRoboticPets();
				shelter.tickAllPets();
				break;

			case 7:
				System.out.println("Which pet would you like to play with?");
				for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
					System.out.println(eachPet.getName() + " " + eachPet.getDescription());
				}
				String userPlayPetSelection = input.nextLine();
				if (shelter.getAllPets().contains(currentPets.get(userPlayPetSelection))) {
					shelter.play(userPlayPetSelection);
					System.out.println("You play with " + userPlayPetSelection + ", they look happy!");
				} else {
					System.out.println("Not a valid choice, goodbye!");
					System.exit(0);
				}
				break;

			case 8:
				System.out.println("We have room for more pets!\nWhat is the pet's name?");
				String userAdmitPetName = input.nextLine();
				System.out.println("Enter a description of the pet");
				String userAdmitPetDescription = input.nextLine();
				System.out.println(
						"What type of pet are they? \nPress 1 for organic Cat \nPress 2 for robotic cat \nPress 3 for organic dog"
								+ "\npress 4 for robotic dog");
				int userAdmitMenuSelect = Integer.parseInt(input.nextLine());
				if (userAdmitMenuSelect == 1) {
					shelter.addPet(new OrganicCat(userAdmitPetName, 0, 0, userAdmitPetDescription, 0, 0, 0, 0));

				} else if (userAdmitMenuSelect == 2) {
					shelter.addPet(new RoboCat(userAdmitPetName, 0, 0, userAdmitPetDescription));
				} else if (userAdmitMenuSelect == 3) {
					shelter.addPet(new OrganicDog(userAdmitPetName, 0, 0, userAdmitPetDescription, 0, 0, 0, 0));
				} else if (userAdmitMenuSelect == 4) {
					shelter.addPet(new RoboDog(userAdmitPetName, 0, 0, userAdmitPetDescription));
				} else {
					System.out.println("Not a valid selection, goodbye!");
					System.exit(0);
				}
				System.out.println("Welcome, " + userAdmitPetName + " we will find you a good home!");

				// adding new pet to the map to be played with or adopted out

				for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
					currentPets.put(eachPet.getName(), eachPet);
				}
				shelter.tickAllPets();
				break;

			case 9:
				System.out.println("Thanks for giving a pet a good home! Which pet would you like to adopt?");
				for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
					System.out.println(eachPet.getName() + " " + eachPet.getDescription());
				}
				String userAdoptPetSelection = input.nextLine();
				if (shelter.getAllPets().contains(currentPets.get(userAdoptPetSelection))) {
					shelter.remove(currentPets.get(userAdoptPetSelection));
					System.out.println(
							"You adopt " + userAdoptPetSelection + ", we hope you have a great life together!");
				} else {
					System.out.println("Not a valid choice, goodbye!");
					System.exit(0);
				}
				shelter.tickAllPets();
				break;

			case 10:
				System.out.println("Here are our adoptable organic cats:");
				for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
					if (eachPet instanceof OrganicCat) {
						System.out.println("\tName: " + ((OrganicCat) eachPet).getName() + "\tHealth Level: "
								+ ((OrganicCat) eachPet).getHealthLevel() + "\tHunger Level: "
								+ ((OrganicCat) eachPet).getHungerLevel() + "\tThirst Level: "
								+ ((OrganicCat) eachPet).getThirstLevel() + "\tHappiness Level: "
								+ ((OrganicCat) eachPet).getHappinessLevel() + "\tLitterbox Cleanliness: "
								+ ((OrganicCat) eachPet).getLitterBoxCleanlinesss());
					}

				}

				System.out.println("Here are our adoptable robotic cats:");
				for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
					if (eachPet instanceof RoboCat) {
						System.out.println("\tName: " + ((RoboCat) eachPet).getName() + "\tHealth Level: "
								+ ((RoboCat) eachPet).getHealthLevel() + "\tHappiness Level: "
								+ ((RoboCat) eachPet).getHappinessLevel());
					}
				}

				System.out.println("Here are our adoptable organic dogs:");
				for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
					if (eachPet instanceof OrganicDog) {
						System.out.println("\tName: " + ((OrganicDog) eachPet).getName() + "\tHealth Level: "
								+ ((OrganicDog) eachPet).getHealthLevel() + "\tHunger Level: "
								+ ((OrganicDog) eachPet).getHungerLevel() + "\tThirst Level: "
								+ ((OrganicDog) eachPet).getThirstLevel() + "\tHappiness Level: "
								+ ((OrganicDog) eachPet).getHappinessLevel() + "\tCage Cleanliness: "
								+ ((OrganicDog) eachPet).getCageCleanliness());
					}
				}

				System.out.println("Here are our adoptable robotic dogs:");
				for (VirtualPetsSuper eachPet : shelter.getAllPets()) {
					if (eachPet instanceof RoboDog) {
						System.out.println("\tName: " + ((RoboDog) eachPet).getName() + "\tHealth Level: "
								+ ((RoboDog) eachPet).getHealthLevel() + "\tHappiness Level: "
								+ ((RoboDog) eachPet).getHappinessLevel());
					}
				}
				break;

			default:
				System.out.println("Not a valid selection, please try again");
				System.exit(0);
				break;
			}

			System.out.println("What else would you like to do at the shelter?");
			userMenuSelect = Integer.parseInt(input.nextLine());

		}
		
		//end of game loop
		
		input.close();
		System.out.println("Thanks for helping out at the shelter today, goodbye!");
		System.exit(0);

	}
}
