package myfirstapp;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String args[]) {


        //HashMap is used to store unique key items.

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // we use put function to insert the elements.
        map.put(100, "A");
        map.put(200, "B");
        map.put(100, "C");
        map.put(400, "D");

        //Now Traversing takes place using Map.Entry

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
