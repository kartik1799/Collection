package myfirstapp;

import java.util.Stack;
import java.util.Iterator;

public class StackInterface {

    //It implements the LIFO operations.
    public static void main(String args[]) {
        Stack<String> st = new Stack<String>();

        //Adding the elements in the arraylist
        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");

        //To remove top element we use pop function in stack interface.

        st.pop();
        //it will remove "D".


        //Traversing The list..

        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Result is
        //A
        //B
        //C

    }
}
