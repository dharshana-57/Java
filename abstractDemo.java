// abstract class have no objects 
// we can't instantiate the abstract class
// abstract method means class must be abstract cls!
// abstract method have no body only declaration
// abstract method must be defined in derived cls!
// object for abstract cls can be created using derived cls

abstract class Human
{
    public abstract void eat();
    public void walk() 
    {
        
    }
}

class Men extends Human // Concrete class
{
    public void eat() 
    {
        
    }
}

public class abstractDemo 
{
    public static void main(String[] args) 
    {
        Human ob = new Men();
    }
}
