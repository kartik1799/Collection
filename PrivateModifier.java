package myfirstapp;

class A{
    private int data=40;
    private void display()
    {
        System.out.println("Hello Java");
    }
}

public class PrivateModifier {
    public static void main(String args[])
    {
        A obj=new A();
        System.out.println(obj.data);
        obj.display();
    }

    // It will produce error as the members and methods are declared as private.
}
