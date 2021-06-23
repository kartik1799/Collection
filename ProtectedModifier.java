package myfirstapp;

public class ProtectedModifier {
    protected void display()
    {
        System.out.println("Hello Java");
    }
}
package firstapp;
import  myfirstapp.*;
class B extends ProtectedModifier{
    public static void main(String args[]){
        B obj=new B();
        obj.display();

        //Protected methods can only be accessed through inheritance.
    }
}

