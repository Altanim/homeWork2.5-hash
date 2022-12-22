import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hw5 {
    public static void main(String[] args) {
        Map<Integer, String> MAP = new LinkedHashMap<>();
        int i = 200;
        for (int j = 0; j < i; j++) {
            MAP.put(j, String.valueOf(j));
        }
        for (Map.Entry<Integer, String> entry : MAP.entrySet()){
            System.out.println(entry.getKey() + "|" + entry.getValue());
        }
    }
}
