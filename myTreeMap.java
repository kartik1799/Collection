package myfirstapp;

import java.util.TreeMap;
import java.util.Map;

public class myTreeMap {
    public static void main(String args[]) {


        //TreeMap is used to store unique key items and prints the key items in sorted order.


        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        // we use put function to insert the elements.
        map.put(100, "A");
        map.put(400, "B");
        map.put(300, "C");
        map.put(200, "D");

        //Now Traversing takes place using Map.Entry

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
