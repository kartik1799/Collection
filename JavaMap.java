package myfirstapp;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {
    public static void main(String args[])
    {
        Map<Integer,String> map=new HashMap<Integer,String>();

        // we use put function to insert the elements.
        map.put(100,"A");
        map.put(200,"B");
        map.put(300,"C");

        //Now Traversing takes place using Map.Entry

        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
