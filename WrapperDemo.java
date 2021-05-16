//int, char, float, double => primitive datatype

//Integer, Character, Float, Double => Wrapper class

public class WrapperDemo 
{
    public static void main(String[] args) 
    {
        int i = 5; // primitive type
        Integer i2  = new Integer(5); // Wrapper class

        Integer i1  = new Integer(i); // => primitive to wrapper class is Boxing/Wrapping
        int j  = i1.intValue(); // Wrapper to primitive => Unboxing/unwrapping

        Integer in = 6; //  Autoboxing / Autowrapping
        int in1 = in; // Autounboxing / Autounwrapping

        String str = "345";
        // parseInt() is a static method 
        int s = Integer.parseInt(str); // converts string to integer
    }
}
