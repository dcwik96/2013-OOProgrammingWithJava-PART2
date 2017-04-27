
import java.util.ArrayList;

public class Container {

  private int limit;
  private ArrayList<Suitcase> suitcases;

  public Container(int limit) {
    this.limit = limit;
    suitcases = new ArrayList<Suitcase>();
  }

  public void addSuitcase(Suitcase suitcase) {
    int max = 0;

    for (Suitcase s : this.suitcases) {
      max += s.totalWeight();
    }

    if (this.limit - max >= suitcase.totalWeight()) {
      this.suitcases.add(suitcase);
    }
  }

  public void printThings() {
    for (Suitcase s : suitcases) {
      s.printThings();
    }
  }

  public String toString() {
    int max = 0;

    for (Suitcase s : this.suitcases) {
      max += s.totalWeight();
    }

    return this.suitcases.size() + " suitcases (" + max + " kg)";
  }
}
