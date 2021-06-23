package myfirstapp;

import java.util.LinkedHashMap;
import java.util.Map;

public class myLinkedHashMap {
    public static void main(String args[]) {


        //LinkedHashMap is used to store unique key items and it also maintains the Insertion Order.

        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

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
