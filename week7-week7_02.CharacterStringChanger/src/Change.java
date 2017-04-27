
public class Change {

  private char fromCharacter;
  private char toCharacter;

  public Change(char fromCharacter, char toCharacter) {
    this.fromCharacter = fromCharacter;
    this.toCharacter = toCharacter;
  }

  public String change(String characterString) {
    String newString = "";
    for (int i = 0; i < characterString.length(); i++) {
      char character = characterString.charAt(i);
      
      if (character == fromCharacter) {
        newString += toCharacter;
      } else {
        newString += character;
      }
    }
    
    return newString;
  }
}
