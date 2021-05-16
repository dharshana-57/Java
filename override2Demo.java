// DYNAMIC METHOD DISPATCH => Runtime polymorphism
// reference of super cls and obj of sub cls ?
// obj of cls method will be executed
// hierarchial inheritance
class A2
{
    public void show()
    {
        System.out.println("in A");
    }
}
class B2 extends A2
{
    public void show() // method overriding
    {
        System.out.println("in B");
    }
    public void config() 
    {
        System.out.println("in B config");
    }
}
class C2 extends A2
{
    public void show() // method overriding
    {
        System.out.println("in C");
    }
}

public class override2Demo {
    public static void main(String[] args) {
        // reference => || A object=>B
        A2 obj = new B2(); // RUNTIME POLYMORPHISM
        obj.show();

        //shows error bcoz cls A doesn't know other methods in cls B
        // obj.config(); 
        
        obj = new C2();
        obj.show(); // Dynamic method dispatch
    }
}
