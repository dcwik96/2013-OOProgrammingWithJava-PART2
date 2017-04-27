
import java.util.Scanner;

public class TextUserInterface {

  private Scanner reader;
  private Plane plane;
  private Flight flight;

  public TextUserInterface(Scanner reader, Plane plane, Flight flight) {
    this.reader = reader;
    this.plane = plane;
    this.flight = flight;
  }

  public void start() {
    String buffor = "";
    System.out.println("Airport panel");
    System.out.println("-----------------\n");
    while (true) {
      System.out.println("Choose operation:");
      System.out.println("[1] Add airplane");
      System.out.println("[2] Add flight");
      System.out.println("[x] Exit");

      buffor = reader.nextLine();

      if (buffor.equals("1")) {
        String name = "";
        int capacity = 0;

        System.out.print("Give plane ID: ");
        name = reader.nextLine();
        System.out.print("Give plane capacity: ");
        capacity = Integer.parseInt(reader.nextLine());

        this.plane.addAirplane(name, capacity);
      } else if (buffor.equals("2")) {
        String name = "", departure = "", destination = "";

        System.out.print("Give plane ID: ");
        name = reader.nextLine();
        System.out.print("Give departure airport code: ");
        departure = reader.nextLine();
        System.out.print("Give destination airport code: ");
        destination = reader.nextLine();
        String road = this.plane.getPlane(name) + " (" + departure + "-" + destination + ")";
        flight.addFlight(road);
      } else if (buffor.equals("x")) {
        break;
      } else {
        System.out.println("Unknown statement");
      }
    }

    System.out.println("Flight service");
    System.out.println("------------------");
    while (true) {
      System.out.println("Choose operation:");
      System.out.println("[1] Print planes");
      System.out.println("[2] Print flights");
      System.out.println("[3] Print plane info");
      System.out.println("[x] Quit");

      buffor = reader.nextLine();

      if (buffor.equals("1")) {
        plane.printPlanes();
      } else if (buffor.equals("2")) {
        flight.printFlights();
      } else if (buffor.equals("3")) {
        System.out.print("Give plane ID: ");
        buffor = reader.nextLine();
        System.out.println(plane.getPlane(buffor));
      } else if (buffor.equals("x")) {
        break;
      } else {
        System.out.println("Unknown statement");
      }
    }
  }
}
