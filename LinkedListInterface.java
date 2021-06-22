package myfirstapp;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListInterface {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<String>();

        //Adding the elements in the arraylist
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");

        //Traversing The list..

        Iterator itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //result is:
        //A
        //B
        //C
        //D

    }
}
