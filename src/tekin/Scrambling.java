package tekin;

//Import funktioniert nicht...
import encryption.Encryptor;

public class Scrambling extends Decorator {

	TextReader tr;

	public Scrambling(TextReader textreader) {
		tr = textreader;
	}

	
	//Klassen die Encrypten und Decrypten (Hilfe von Markus)
	@Override
	public void read(String[] s) {
		System.out.println("!ENCRYPTION WORKED!");
		return Encryptor.encrypt(tr.read(s));
	}

	@Override
	public void write(String[] s) {
		System.out.println("!DECRYPTION WORKED!");
		tr.write(Encryptor.decrypt(s));
	}
}
