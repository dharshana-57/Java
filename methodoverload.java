class Casio
{
    public void addnos(int i, int j) { // method overloading
        System.out.println(i+j);
    }
    public void addnos(int i, int j,int k) {
        System.out.println(i+j+k);
    }
    public void addnos(double i, double j) {
        System.out.println(i+j);
    }
}
public class methodoverload {
    public static void main(String[] args) {
        Casio c1 = new Casio();
        c1.addnos(12, 5);
        c1.addnos(12, 5, 9);
        c1.addnos(12.7, 5.0);
        
    }
}
