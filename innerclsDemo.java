// class inside class => Inner class -> 3 class file will be created
class Outer // Outer.class
{
    static int a;

    static public void show()
    {
        System.out.println("in show - outer :" + a);
    }

    static class Inner // Outer$Inner.class
    {
        public void display()
        {
            System.out.println("in display : Inner ");
        }
    }
}
public class innerclsDemo // innerclassDemo.class
{ 
    public static void main(String[] args) 
    {

        // Outer ob1 = new Outer(); // non-static access
        // ob1.show();  // non-static access
        Outer.show(); // static access

        // Outer.Inner ob2 = ob1.new Inner(); // non-static class
        Outer.Inner ob2 = new Outer.Inner(); // static class
        ob2.display();
    }
}
/**
 * Inner class:
 * Member class,
 * Static class,
 * anonymous class
 */
