/**
 * In interfaces also using default method it causes ambiguity
 * for that we have 2 solution:
 * we can override method in cls or
 * or by using super interface method: 
    InterfaceName.super.MethodName();
 */


interface Demo1
{
    void abc();
    default void show() 
    {
        System.out.println("in Demo1 show");
    }
}

interface Demo2
{
    default void show() 
    {
        System.out.println("in Demo2 show");
    }
}

class DemoImp1 implements Demo1,Demo2
{
    public void abc()
    {
        System.out.println("in abc");
    }

    @Override
    public void show() 
    {
        // System.out.println("in Demoimp show");
        // here we are calling interface Demo1 method using super keyword
        Demo1.super.show();
        Demo2.super.show();
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Demo1 obj = new DemoImp1();
        obj.show();
        obj.abc();
    }
}
