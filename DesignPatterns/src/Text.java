
public class Text implements IPrintable {

	private IPrintable[] txt;
	
	public Text(IPrintable... txt) {		
		this.txt = txt;
	}
	
	public void print(IPrinter printer) {
		for (int i = 0; i < txt.length; i++) {
			txt[i].print(printer);
		}
	}

}
