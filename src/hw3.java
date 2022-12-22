import java.util.HashMap;
import java.util.Map;

public class hw3 {
    private static final Map<String, Integer> MAP = new HashMap<>();
    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            MAP.put(String.valueOf(i),i);
        }
        System.out.println(MAP);
        tryPut(String.valueOf(3),9);
        System.out.println(MAP);

    }
    private static void tryPut(String key, Integer value){
        if(MAP.containsKey(key) && MAP.get(key).equals(value)){
            throw new IllegalArgumentException("Такие ключ и значение уже есть в карте");
        }
        MAP.put(key, value);
    }
}
