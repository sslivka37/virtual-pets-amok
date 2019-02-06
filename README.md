# virtual-pets-amok
module 4 project using inheritance and interfaces

__**Sarah Slivka Virtual Pets Amok Project- Module 4 inheritance and interfaces**__

In this project there is an abstract superclass VirtualPetsSuper, which is extended by the abstract classes Dog and Cat.

OrganicDog and RoboDog extend the Dog class and OrganicCat and RoboCat extend the Cat class

OrganicDog and OrganicCat implement the OrganicPetTasks interface, which includes feeding and watering the pets. 

RoboDog and RoboCat implement the RoboticPetTasks interface, which is oiling the robotic pets

There is a game loop where users can interact with pets in the shelter, and after every interaction the tick() method is called, which represents the passage of time.

In the future I plan on taking the cases for the switch and turning them into methods to clean up the code in the main app section
