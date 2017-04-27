
import java.util.ArrayList;
import java.util.HashMap;


public class Flight {
 
  private ArrayList<String> arrayFlights;
  
  public Flight() {
    this.arrayFlights = new ArrayList<String>();
  }
  
  public void addFlight(String name) {
    this.arrayFlights.add(name);
  }
  
  public void printFlights() {
    if (!this.arrayFlights.isEmpty()) {
      for (String name : this.arrayFlights) {
        System.out.println(name);
      }
    }
  }
}
