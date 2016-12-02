
public class PrinterDefault implements IPrinter {

	public void printPrintable(IPrintable data) {
		data.print(this);	
	}
	
	public void printString(String data) {
		System.out.print(data);	
	}



}
