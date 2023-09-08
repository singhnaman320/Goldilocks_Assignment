import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchHashMapWithScanner {

    public static void main(String[] args) {

        // Creating HashMap to store the name and age
        Map<String, Integer> storeMap =  new HashMap<>();

        // Adding values to storeMap
        storeMap.put("Naman", 27);
        storeMap.put("Kaushik", 18);
        storeMap.put("Ram", 15);
        storeMap.put("Shyam", 21);
        storeMap.put("Shiv", 28);

        // Now we will search the value by key

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter the searching key..");
        String key =  scanner.next();

        if (storeMap.containsKey(key)){
            int age = storeMap.get(key);

            System.out.println("Age of "+key + " is " + age);

        }else {

            System.out.println("Unable to search for given key in storeMap");
        }

    }
}
