class Cal{
    int n1, n2;
    int result;
    public Cal() { //default constructor
        n1 = 5;
    }
    public Cal(int n) { // parameterized constructor
        n1 = n;
    }
    public void addno()
    {
        result = n1 + n2;
    }
}
public class module2 {
    public static void main(String[] args) {
        Cal b1 = new Cal(); // constructor called automatically
        // b1.n1 = 34;
        b1.n2 = 56;
        b1.addno();
        System.out.println(b1.result);
        Cal b2 = new Cal(6); 
        b2.n2 = 56;
        b2.addno();
        System.out.println(b2.result);
    }
}
