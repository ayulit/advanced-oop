package delegation.complex;

import java.util.Scanner;

/**
 * Класс таймера. При определённых условиях вызывается действие TimerAction. 
 */
public class Timer {

	TimerAction action;

    /**
     * Функция, которую вызывает программист для установки времени.
     */
    void run() {
        if (isTime()) {
            action.onTime();
        }
    }

    /**
     * Некоторая функция, которая берет на себя всю работу со временем. Её
     * реализация не интересна в данном контексте.
     * 
     * @return
     */
    private boolean isTime() {
        return true;
    }
    
	public static void main(String[] args) {
		System.out.println("Введите тип действия:");
		Scanner scanner = new Scanner(System.in);
		String actionType = scanner.nextLine();
		
		Timer timer = new Timer();
		
		
		// делегирование
        if (actionType.equalsIgnoreCase("wakeup")) {
            timer.action = new WakeUpAction();
        } else if (actionType.equalsIgnoreCase("chicken")) {
            timer.action = new ChickenIsReadyAction();
        }
        
        timer.run();

	}

}
