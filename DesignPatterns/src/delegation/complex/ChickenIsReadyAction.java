package delegation.complex;

public class ChickenIsReadyAction implements TimerAction {

	public void onTime() {
		System.out.println("Цыплёнок готов!");
	}

}
