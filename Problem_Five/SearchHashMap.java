import java.util.HashMap;
import java.util.Map;

public class SearchHashMap {

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
        String[] searchKey = {"Ram", "Shiv", "Vivek"};

        for (String key : searchKey){
            if (storeMap.containsKey(key)){
                int age = storeMap.get(key);

                System.out.println("Age of "+key + " is " + age);

            }else {

                System.out.println("Unable to search for given key in storeMap");
            }
        }
    }
}

/*
    Instead of using searchKey array, if we want then we can also use scanner class to take input from user
*/