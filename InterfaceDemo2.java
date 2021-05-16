// interface => to achieve generalization
// here anonymous class is used
// anonymous cls is used to instantiate interface => create object of interface
// it uses less memory than normal cls
// anonymous cls method(definition) cannot be reused

interface ABC 
{
    void show();
}

// class Implementor implements ABC
// {
//     public void show()
//     {
//         System.out.println("anything");
//     }
// }
public class InterfaceDemo2 
{
    public static void main(String[] args) 
    {
        // ABC obj = new Implementor()
        ABC obj = new ABC(){
            public void show()
            {
                System.out.println("iam the best");
            }
        };
        obj.show();
    }
}
