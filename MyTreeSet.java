package myfirstapp;

import java.util.HashSet;
import java.util.Iterator;

public class MyTreeSet {

    // Tree Set is quite fast than other sets.

    //The elements in TreeSet are in Increasing Order.
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();
        set.add("D");
        set.add("B");
        set.add("A");
        set.add("D");

        //Now traversing through the set.



        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

