import java.util.Map;

public class PhoneBook {
    private final Map<String, String> map = new java.util.HashMap<>();
    public void add(String name, String phone){
        map.put(name,phone);
    }
    public void printPhone(){
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("ФИО: " + entry.getKey() + "\nНомер телефона: " + entry.getValue() + "\n");
        }
    }


}
