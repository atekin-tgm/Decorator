package tekin;

import java.io.IOException;

public class Authentication extends Decorator {

	String pw;
	TextReader tr;
	
	public Authentication(TextReader textreader) {
		tr = textreader;
	}
	
	//Mit Write wird ein Passwort gesetzt
	@Override
	public void write(String[] s) {
		
		try {
			pw = in.readLine();
			tr.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Mit read wird geprüft ob das Passwort das gleiche ist
	@Override
	public void read(String[] s) {
		
		try {
			System.out.print("!THE PASSWORD! ");
			String equalpw = in.readLine();
			
			if (pw.equals(equalpw)) {
				tr.read(s);
			} else {
				System.out.println("!WRONG PASSWORD!");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
}
