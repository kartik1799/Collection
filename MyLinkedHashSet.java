package myfirstapp;

import java.util.Iterator;
import java.util.LinkedHashSet;

//It maintains the Insertion order and permits null elements
//This makes it different from the Hash Set

public class MyLinkedHashSet {
    public static void main(String args[]) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
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
