package hasing;
import java.util.HashMap;
import java.util.Map;
public class hasing_map {
    public static void main(String...args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("india", "delhi");
        map.put("bharat", "delhi");
        map.put("pakistan", "islamabad");
        map.put("nepal", "kathmandu");
        
        String targetValue = "delhi";

        // System.out.println(map)
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(targetValue)) {
                System.out.println("Key for value '" + targetValue + "': " + entry.getKey());
              // If you only want the first matching key, you can break out of the loop.
            }
        }
    }
        

    }

