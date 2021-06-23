package myfirstapp;

public class TestConstructor {
    /* TestConstructor()
    {
        System.out.println("Constructor is created");
    }
    public static void main(String args[]){
        System.out.println("Default Constructor");
        TestConstructor a=new TestConstructor();

    }
     */

    //ParaMetrized Constructor
    int id;
    String name;

    TestConstructor(int i, String n) {
        id = i;
        name = n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        TestConstructor s1=new TestConstructor(111,"A");
        TestConstructor s2=new TestConstructor(222,"B");
        s1.display();
        s2.display();
    }

}
