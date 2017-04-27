
import java.util.ArrayList;

public class Suitcase {

  private ArrayList<Thing> things;
  private int limit;

  public Suitcase(int limit) {
    this.things = new ArrayList<Thing>();
    this.limit = limit;
  }

  public void addThing(Thing thing) {
    if (this.limit - this.totalWeight() >= thing.getWeight()) {
      this.things.add(thing);
    }
  }

  public int totalWeight() {
    int counter = 0;
    for (Thing t : things) {
      counter += t.getWeight();
    }
    return counter;
  }

  public void printThings() {
    for (Thing t : things) {
      System.out.println(t);
    }
  }

  public Thing heaviestThing() {
    if (this.things.size() != 0) {

      int heaviest = this.things.get(0).getWeight();

      for (Thing t : things) {
        if (t.getWeight() > heaviest) {
          heaviest = t.getWeight();
        }
      }

      for (Thing t : things) {
        if (t.getWeight() == heaviest) {
          return t;
        }
      }
    }
    return null;
  }

  public String toString() {
    if (things.size() == 0) {
      return "empty (" + this.totalWeight() + " kg)";
    }
    if (things.size() == 1) {
      return things.size() + " thing (" + this.totalWeight() + " kg)";
    } else {
      return things.size() + " things (" + this.totalWeight() + " kg)";

    }

  }
}
