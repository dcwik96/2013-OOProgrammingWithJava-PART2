
import java.util.ArrayList;

public class Changer {

  ArrayList<Change> changes;

  public Changer() {
    changes = new ArrayList<Change>();
  }
  
  public void addChange(Change change) {
    changes.add(change);
  }

  public String change(String characterString) {
    for (Change c : changes) {
      characterString = c.change(characterString);
    }
    return characterString;
  }
}
