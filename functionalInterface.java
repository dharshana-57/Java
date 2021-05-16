// Types of interface

/**
 * 1. Normal interface
 * 2. (Single Abstract Method) SAM interface => only one abstract method! -> now it become functional interface (java 8) => Lambda Expression - derived from scala lang
 * 3. Marker interface => no method
 * eg: Serializable interface (in-built)
*/

@FunctionalInterface
interface Abcd
{
    void show();
}

public class functionalInterface {
    public static void main(String[] args) {
        // lambda expression = () -> {}
        Abcd obj = () -> {
            System.out.println("in show Abcd");
            System.out.println("in show Abcd");
        };


        //  Abcd obj = () -> System.out.println("in show Abcd");
        // create interface object in one line
        // lambda expression only works with functional interface

        obj.show();
    }
}
