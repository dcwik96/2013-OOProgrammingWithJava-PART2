
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

  public static void main(String[] args) {
    HashMap<String, String> nick = new HashMap<String, String>();

    nick.put("matti", "mage");
    nick.put("mikael", "mixu");
    nick.put("arto", "arppa");

    String hash = nick.get("mikael");
    System.out.println(hash);
  }

}
