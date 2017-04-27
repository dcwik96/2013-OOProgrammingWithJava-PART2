
import java.util.ArrayList;
import java.util.HashMap;

public class Plane {

  private HashMap<String, Integer> planeInfo;

  public Plane() {
    this.planeInfo = new HashMap<String, Integer>();
  }

  public void addAirplane(String name, int capacity) {
    this.planeInfo.put(name, capacity);
  }

  public String getPlane(String name) {
    if (this.planeInfo.containsKey(name)) {
      return name + " (" + this.planeInfo.get(name) + " ppl)";
    } else {
      return null;
    }
  }

  public void printPlanes() {
    if (!this.planeInfo.isEmpty()) {
      for (String name : this.planeInfo.keySet()) {
        System.out.println(name + " (" + this.planeInfo.get(name) + " ppl)");
      }
    }
  }

}
