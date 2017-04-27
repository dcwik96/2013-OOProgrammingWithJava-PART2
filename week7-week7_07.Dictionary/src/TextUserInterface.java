
import java.util.Scanner;

public class TextUserInterface {

  private Scanner reader;
  private Dictionary dictionary;

  public TextUserInterface(Scanner reader, Dictionary dictionary) {
    this.reader = reader;
    this.dictionary = dictionary;
  }

  public void start() {
    String buffor = "";
    System.out.println("Statement:");
    System.out.println("\tquit - quit the text user interface");
    System.out.println("\tadd - adds a word pair to the dictionary");
    System.out.println("\ttranslate - asks a word and prints its translation");

    while (true) {
      System.out.print("Statement: ");
      buffor = reader.nextLine();
      if (buffor.equals("quit")) {
        break;
      } else if (buffor.equals("add")) {
        String inFinnish = "", translation = "";

        System.out.print("In Finnish: ");
        inFinnish = reader.nextLine();
        System.out.print("Translation: ");
        translation = reader.nextLine();

        this.dictionary.add(inFinnish, translation);
      } else if (buffor.equals("translate")) {
        System.out.print("Give a word: ");
        buffor = reader.nextLine();

        System.out.println("Translation: " + this.dictionary.translate(buffor));
      } else {
        System.out.println("Unknown statement");
      }
    }
  }
}
