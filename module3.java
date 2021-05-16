class Calc{
    int n1, n2;
    int result;
    public Calc(int n1, int n2) { 
        this.n1 = n1; // this represents current object
        this.n2 = n2;
    }
}
public class module3 {
    public static void main(String[] args) {
        Calc b1 = new Calc(4,6);
        System.out.println(b1.n1);
        System.out.println(b1.n2);
    }
}
