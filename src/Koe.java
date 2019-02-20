
public class Koe {

	String naam;
	boolean isZiek;
	boolean lopen;

	Koe(String deNaam) {

		naam = deNaam;
	}

	public void isZiek()

	{
		isZiek = true;
		System.out.println("de koe is ziek");
		lopen();

	}

	void lopen() {
		if (!isZiek) {
			System.out.println("De koe kan weer lopen");
		} else {
			System.out.println("De koe is te ziek om te lopen");
		}

	}

}
