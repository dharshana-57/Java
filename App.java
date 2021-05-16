public class App {
    public static void main(String[] args) throws Exception {
        int num = 5_00_000; // 4 bytes -> 2e-31 to 2e+31
        System.out.println(num);
        float num1 = 9.9f; // 4 bytes
        short num3 = 56; // 2 bytes > -32768 to 32767
        double num2 = 5.5; // 8 bytes -> by default
        byte num4 = 6; // 1 bytes -> -128 to 127
        long l = 67l; // 8 bytes
        char c ='A';
        c = 67;
        System.out.println(c);
        double d1 = 5; // implicit conversion
        System.out.println(d1);
        int k =(int)5.9; // explicit conversion - type casting
    } 
}
