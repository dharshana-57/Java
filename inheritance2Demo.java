class A 
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int i)
    {
        System.out.println("in int A" + i);
    }
}
class B extends A
{
    public B()
    {
        super(5); // by default
        System.out.println("in B");
    }
    public B(int j)
    {
        super(j); // default
        System.out.println("in int B" + j);
    }
}
public class inheritance2Demo 
{
    public static void main(String[] args) 
    {
        // A ob2 = new A();
        B ob1 = new B();
    }
}
