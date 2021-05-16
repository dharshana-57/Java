class A1
{
    public void show()
    {
        System.out.println("in A");
    }
}
class B1 extends A1
{
    @Override // annotation -> shows =>  compile time error
    public void show() // method overriding
    {
        super.show(); // super -> keyword used to access super cls method
        System.out.println("in B");
    }
}

public class OverridingDemo 
{
    public static void main(String[] args) 
    {
        B1 obj = new B1();
        obj.show();
    }
}
