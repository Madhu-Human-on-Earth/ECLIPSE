package Opps;

public class multilevel {

	public static void main(String[] args) {
		// Creating an object of the rat class
		rat ratObj = new rat("Meow", "Rice", "Cheese");
		ratObj.display(); // This will call the rat class display method
	}
}

class dog {
	String sound;

	dog() {
		sound = "Bark";
	}

	void display() {
		System.out.println("Sound: " + sound);
	}
}

class cat extends dog {
	String food;

	cat(String s) {
		super(); // Calls dog class constructor
		this.sound = s; // Set sound for the cat
		this.food = "Chicken"; // Default food
	}

	void display() {
		System.out.println("Sound: " + sound);
		System.out.println("Food: " + food);
	}
}

class rat extends cat {
	String work;

	rat(String sound, String food, String work) {
		super(sound); // Calls cat constructor with sound
		this.food = food; // Set food for rat
		this.work = work;
	}

	@Override
	void display() {
		super.display(); // Call cat's display method
		System.out.println("Work: " + work);
	}
}
