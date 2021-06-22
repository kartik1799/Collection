package myfirstapp;

import java.util.Vector;
import java.util.Iterator;

public class VectorInterface {

    //Vector is synchronised which makes it different from array list.
    //Here is what i have done

    public static void main(String args[]) {

        //I am using String generics to add on the values in our vector interface.
        Vector<String> vc = new Vector<String>();

        //Adding the elements in the arraylist
        vc.add("A");
        vc.add("B");
        vc.add("C");
        vc.add("D");

        //Traversing The list..

        Iterator itr = vc.iterator();
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
