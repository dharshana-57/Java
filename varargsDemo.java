class Addition
{
    // Variable length Arguments => Varargs
    public int add(int ...i) // {2,5,6,7,81,8,90} => int i[]
    {
        int s = 0;
        for (int j : i) 
        {
            s += j;
        }
        return s;
    }
}

public class varargsDemo {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(2,5,6,7,81,8,90)); 
    }
}
