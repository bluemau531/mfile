
import java.util.HashMap;

public class Properties {

    // Create our HashMap
    public HashMap<String, Integer> properties = new HashMap<>();    

    public static void main(String[] args) {
        // A Hash map - is a data structure that stores key pair values,
        // are memory efficient, and do not maintain order.
        
        Properties p = new Properties();

        p.properties.put("Bikini Bottom", 50);
        p.properties.put("Avenger's Tower", 1000);
        p.properties.put("Yoda's Bar & Clubhouse", 5000);
        p.properties.put("Dog City the House", 200);
        p.properties.put("McDonald's Headquarters", 50000);

        for(String key: p.properties.keySet()){
            System.out.println(key + " $" + p.properties.get(key));
        }
        
        System.out.println(p.properties.containsKey("Bikini Bottom"));
        System.out.println(p.properties.containsValue(10100));
        System.out.println(p.properties.size());
    }

}


//HashMap Cheat Sheet
//------------------------------------------------------------------------
//map.get(key)                  --> returns the VALUE for the Key-Pair 
//map.containsKey(key)          --> returns BOOLEAN, checks if HashMap contains a specific key
//map.containsValue(value)      --> returns BOOLEAN, checks if HashMap contains a specific value
//map.size()                    --> returns INTEGER, if 5 Key-Pair Values in HashMap then size = 5 
//for(String key: map.keySet()) --> runs through the map key by key