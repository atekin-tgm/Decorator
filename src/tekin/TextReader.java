package tekin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Textreaderklasse vom Lehrer!
//protected rausgelöscht!
public interface TextReader {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	void write(String[] s);
	void read(String[] s);
}