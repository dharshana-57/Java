// java 1.8 => now you can define static methods interface

// we can define a method using default keyword itself but we need an object to call them

// we can define static method and can call them without object of a cls

// by default the variable in interface are final

interface Demo
{
    /*final*/int num = 9;
    void abc(); 

    // note: we can't define the declared method in same interface -> it will show duplicate method error

    static void show()
    {
        System.out.println("hoo!");
    }
}

public class StaticInterfaceMethod {
    public static void main(String[] args) {
        Demo.show();
    }
}
