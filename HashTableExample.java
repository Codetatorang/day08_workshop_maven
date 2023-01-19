package sg.edu.nus.iss;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public void example() {
        Map<String, Integer> phones = new Hashtable<>();

        phones.put("iPhone", 10);
        phones.put("Samsung", 1);
        phones.put("Oppo", 50);
        phones.put("Huawei", 20);

        System.out.println("Total phone types: " + phones.size());

        for (String key : phones.keySet()) {
            System.out.println(key + "-" + phones.get(key));
        }
        Console cons = System.console();
        String searchString = "";
        searchString = cons.readLine("Enter searchString: ");

        while (!searchString.equals("quit")) {
            if (phones.containsKey(searchString)) {
                System.out.println(searchString + "-" + phones.get(searchString));
            }else{
                continue;
            }
        }
    }

}
