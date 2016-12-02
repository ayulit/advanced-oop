package delegation.complex;

import java.util.Scanner;

/**
 * ����� �������. ��� ����������� �������� ���������� �������� TimerAction. 
 */
public class Timer {

	TimerAction action;

    /**
     * �������, ������� �������� ����������� ��� ��������� �������.
     */
    void run() {
        if (isTime()) {
            action.onTime();
        }
    }

    /**
     * ��������� �������, ������� ����� �� ���� ��� ������ �� ��������. Ÿ
     * ���������� �� ��������� � ������ ���������.
     * 
     * @return
     */
    private boolean isTime() {
        return true;
    }
    
	public static void main(String[] args) {
		System.out.println("������� ��� ��������:");
		Scanner scanner = new Scanner(System.in);
		String actionType = scanner.nextLine();
		
		Timer timer = new Timer();
		
		
		// �������������
        if (actionType.equalsIgnoreCase("wakeup")) {
            timer.action = new WakeUpAction();
        } else if (actionType.equalsIgnoreCase("chicken")) {
            timer.action = new ChickenIsReadyAction();
        }
        
        timer.run();

	}

}
