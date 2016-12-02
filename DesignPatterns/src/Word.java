
public class Word implements IPrintable {

	private String str;
	
	public Word(String str) {		
		this.str = str;
	}

	public void print(IPrinter printer) {
		printer.printStringData(str);
	}

}
