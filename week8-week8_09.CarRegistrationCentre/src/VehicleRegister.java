
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {

  private HashMap<RegistrationPlate, String> vehicleRegister;

  public VehicleRegister() {
    vehicleRegister = new HashMap<RegistrationPlate, String>();
  }

  public boolean add(RegistrationPlate plate, String owner) {
    if (!this.vehicleRegister.containsKey(plate)) {
      this.vehicleRegister.put(plate, owner);
      return true;
    }
    return false;
  }

  public String get(RegistrationPlate plate) {
    return this.vehicleRegister.get(plate);
  }

  public boolean delete(RegistrationPlate plate) {
    if (this.vehicleRegister.containsKey(plate)) {
      this.vehicleRegister.remove(plate);
      return true;
    }
    return false;
  }

  public void printRegistrationPlates() {
    if (!this.vehicleRegister.isEmpty()) {
      for (RegistrationPlate rp : this.vehicleRegister.keySet()) {
        System.out.println(rp);
      }
    }
  }

  public void printOwners() {
    if (!this.vehicleRegister.isEmpty()) {
      ArrayList<String> owners = new ArrayList<String>();
      
      for (RegistrationPlate rp : this.vehicleRegister.keySet()) {
        if (!owners.contains(this.vehicleRegister.get(rp))) {
          owners.add(this.vehicleRegister.get(rp));
        }
      }
      
      for (String s : owners) {
        System.out.println(s);
      }
    }
  }
}
