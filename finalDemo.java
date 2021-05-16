/**
 * final keyword:

 * variables => MAKE A VARIABLE FINAL MEANS IT BECOMES CONSTANT VARIABLE
 
 * methods => MAKE A METHOD FINAL MEANS NO CLASS CAN OVERRIDE IT
 
 * class => MAKE A CLASS FINAL MEANS NO OTHER CLASS CAN EXTEND FINAL CLASS - inheritable
 * 
 */

class A8
{
    final int DAY; // final variable => constant
    public A8()
    {
        DAY = 10;
        // DAY = 8;
    }
}

 
/*final*/class R
{
    public /*final*/ void show() {
        System.out.println("in show of R");
    }
}

class S extends R
{
    public void show() {
        System.out.println("in show of S");
    }
}

public class finalDemo {
    public static void main(String[] args) {
        A8 obj = new A8();
        System.out.println(obj.DAY);
        S ob = new S();
        ob.show();
    }
}
