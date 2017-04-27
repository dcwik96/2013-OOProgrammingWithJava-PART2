
import java.util.HashMap;


public class PromissoryNote {
  private HashMap<String, Double> debt;
  
  
  public PromissoryNote() {
    this.debt = new HashMap<String, Double>();
  }

  public void setLoan(String toWhom, double value) {
    debt.put(toWhom, value);
  }

  public double howMuchIsTheDebt(String whose) {
    if (this.debt.containsKey(whose)) {
      return this.debt.get(whose);
    }
    return 0;
  }
}
