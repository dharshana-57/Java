/**
 * staticModule
 */
class Emp
{
    int eid, salary;
    static String ceo;

    static{ // when u load a class
        ceo = "harry";
        System.out.println("in static1");
    }

    public Emp(){ // executed when u create an object
        eid = 1;
        salary = 2000;
        System.out.println("in constructor");
    }

    static{
        ceo ="Potter";
        System.out.println("in static2");
    }

    public void show(){
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}
public class staticModule {
    static int i = 8;
    public static void main(String[] args) {
        i = 6;
        Emp navin = new Emp();
        navin.eid = 3;
        navin.salary = 4000;
        // Emp.ceo = "rayer"; // don't need object to access

        Emp rahul = new Emp();
        // rahul.eid = 4;
        // rahul.salary = 8000;
        // // rahul.ceo = "rayer";
        // Emp.ceo = "winaOstley";
        
        navin.show();
        rahul.show();
    }
}
/**
 * static variables are same for all objects
 * non- static variables are different for different objects
 * can't use non-static variable in static block (eg:static method )
 */