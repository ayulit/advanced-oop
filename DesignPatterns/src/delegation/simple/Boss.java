package delegation.simple;

public class Boss {
	
	Padawan vasya = new Padawan(); // создаем объект, методами которого будет делегироваться поведение

	// method-stub
	void clearSnow() {
		vasya.clearSnow();
	}
	
	// method-stub
	void goForBeer() {
		vasya.goForBeer();
	}
}
