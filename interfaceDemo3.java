// Abstract cls => Define and declare
// Interface cls => declare only 1.7 upto
// in java 1.8 define method in interface

@FunctionalInterface
interface Demo
{
    void abc();

    // public void show(){} => shows error bcoz by default public abstract method so use "default" keyword to define a method

    default void show() 
    {
        System.out.println("in show");
    }
}


class DemoImp implements Demo
{
    public void abc()
    {
        System.out.println("in abc");
    }
    
    public void show() // method overriding is possible
    {
        System.out.println("in cls show");
    }
}


public class interfaceDemo3 {
    public static void main(String[] args) {
        Demo obj = new DemoImp();
        obj.show();
        obj.abc(); // like inheritance we can use it
    }
}
