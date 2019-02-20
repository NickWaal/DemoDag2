//Boer
//Koe
//Koe methode ziek
//Dierenarts – maakt de koe beter

public class Main {

	public static void main(String[] args) {
		Boer boer1 = new Boer("Sjakie");
		Dierenarts arts = new Dierenarts();

		boer1.deKoe = new Koe("Koetje");

		System.out.println("Is de boer ziek? " + boer1.deKoe.isZiek);

		boer1.deKoe.isZiek();
		System.out.println("Is de boer ziek? " + boer1.deKoe.isZiek);
		arts.beterMaken(boer1.deKoe);
		System.out.println("Is de boer ziek? " + boer1.deKoe.isZiek);

	}

}
