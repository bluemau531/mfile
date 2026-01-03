
import java.util.ArrayList;
import java.util.HashMap;

public class Properties {

    // Create our HashMap
    public HashMap<String, Integer> properties = new HashMap<>();    

    public Properties(){
        // Creating Properties Key/Values
        properties.put("Bikini Bottom", 50);
        properties.put("Avenger's Tower", 1000);
        properties.put("Yoda's Bar & Clubhouse", 5000);
        properties.put("Dog City the House", 200);
        properties.put("McDonald's Headquarters", 50000);
    }

    public String getProperty(){
        return "The price is: $ " + properties.get("Bikini Bottom");
    }

    public ArrayList<String> getAllProperties(){
        ArrayList<String> list = new ArrayList<String>();
        for(String key: properties.keySet()){
           list.add(key);
        }

        return list;

    }

    public void displayInfo(){
        for(String key: properties.keySet()){
            System.out.println(key + " $" + properties.get(key));
        }
    }

}

// A Hash map - is a data structure that stores key pair values,
// are memory efficient, and do not maintain order.

//HashMap Cheat Sheet
//------------------------------------------------------------------------
//map.get(key)                  --> returns the VALUE for the Key-Pair 
//map.containsKey(key)          --> returns BOOLEAN, checks if HashMap contains a specific key
//map.containsValue(value)      --> returns BOOLEAN, checks if HashMap contains a specific value
//map.size()                    --> returns INTEGER, if 5 Key-Pair Values in HashMap then size = 5 
//for(String key: map.keySet()) --> runs through the map key by key