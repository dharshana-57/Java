class Printer
{
    // advantage of using reference of super-class
    public void show(Number i ) 
    {
        System.out.println(i);
    }

    // public void show(Integer i ) 
    // {
    //     System.out.println(i);
    // }

    // public void show(Double i ) 
    // {
    //     System.out.println(i);
    // }
}

public class abstractDemo2 
{
    public static void main(String[] args) 
    {
        Printer p1 = new Printer();
        p1.show(6.7);
    }
}
