package tekin;

import java.io.IOException;

//Workerklasse vom Lehrer!
public class Worker implements TextReader {
    public void write( String[] s ) {
      System.out.print( "INPUT:    " );
      try {
        s[0] = in.readLine();
      } catch (IOException ex) { ex.printStackTrace(); }
    }
    public void read( String[] s ) {
      System.out.println( "Output:   " + s[0] );
  } }