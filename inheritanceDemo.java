/**
 * single level inheritance => class B extends A
 * Multi level inheritance => class C extends B & class B extends A
*/
class Calculator // super, parent, base cls
{
    public int addn(int i, int j)
    {
        return (i+j);
    }
}

class CalAdv extends Calculator // sub, child, derived cls
{
    public int subn(int i, int j)
    {
        return (i-j);
    }
}
class CalVeryAdv extends CalAdv 
{
    public int multiplyn(int i, int j)
    {
        return (i * j);
    }
}

public class inheritanceDemo 
{
    public static void main(String[] args) 
    {
        CalVeryAdv ob1 = new CalVeryAdv();

        int r1 = ob1.addn(2, 6);
        int r2 = ob1.subn(5, 2);
        int r3 = ob1.multiplyn(8, 2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
