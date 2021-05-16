// your purpose is only to override an method , for that you are creating a new class means you can use anonymous class
// a class that is for one-time use 

/*
in general, we create a cls then create an obj
but in anonymous cls, we create obj and specify implementation of it
*/
 
// see InterfaceDemo2.java for more

class A3
{
    void show()
    {
        System.out.println("in show A");
    }
}


public class anonymousClass 
{
    public static void main(String[] args) 
    {
        // a class that doesn't have name -> anonymous cls
        A3 obj1 = new A3(){ // a class that replaces sub-cls
            void show()
            {
                System.out.println("in show Anonymous");
            }        
        };
        obj1.show();

    }
}
