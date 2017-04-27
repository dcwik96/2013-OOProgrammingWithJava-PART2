
import java.util.*;

public class Reader {

  private Scanner reader;

  public Reader() {
    reader = new Scanner(System.in);
  }
  
  public String readString() {
    String readString = reader.nextLine();
    return readString;
  }

  public int readInteger() {
    int readInteger = Integer.parseInt(reader.nextLine());
    return readInteger;
  }
}
