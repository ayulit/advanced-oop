
public class PrinterSpecial extends PrinterDefault {
	
	public void printPrintable(IPrintable data) {
		if (data instanceof Word) {
			super.printString("(");
			data.print(this);
			super.printString(")");
		} else {
			super.printPrintable(data);
		}
	}

}
