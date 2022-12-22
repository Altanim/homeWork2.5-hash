import java.util.*;

public class hw4 {

    public static void main(String[] args) {
        Random random = new Random();
        Map<String, List<Integer>> MAP = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            List<Integer> nums = new ArrayList<>(3);
            for (int j = 0; j < 3; j++) {
                nums.add(random.nextInt(1000));
            }
            MAP.put(String.valueOf(i), nums);
        }
        System.out.println(MAP);
        Map<String,Integer> newMAP = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : MAP.entrySet()){
            int sum = 0;
            List<Integer> nums = entry.getValue();
            for (Integer num : nums){
                sum += num;
            }
            newMAP.put(entry.getKey(), sum);
        }
        System.out.println(newMAP);
    }
}
