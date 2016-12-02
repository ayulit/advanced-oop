
public class Runner {

	public static void main(String[] args) {
		
		Text txt = new Text(new Word("Testing"), new Sign(' '), 
				            new Word("my"), new Sign(' '),
				            new Word("architecture"), new Sign('!'));
		
		txt.print(new PrinterDefault());
		
		txt.print(new PrinterSpecial());
	}

}
