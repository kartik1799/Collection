package myfirstapp;

import java.util.ArrayList;
import java.util.*;

public class ArrayList_Interface {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();

        //Adding the elements in the arraylist
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);

        //Removing elements in array list.

        list.remove(3);
                //it will remove element at 3rd index.

        System.out.println(list);

        //Traversing The list..

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }




    }
}
