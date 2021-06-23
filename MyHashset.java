package myfirstapp;

import java.util.Iterator;
import java.util.HashSet;

//Hash Set is used to Print Unique elements.

public class MyHashset {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("A");
        set.add("D");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
