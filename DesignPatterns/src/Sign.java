
public class Sign implements IPrintable {

	private char ch;
	
	public Sign(char ch) {		
		this.ch = ch;
	}
	
	public void print(IPrinter printer) {
		printer.printStringData(String.valueOf(ch));
	}

}
