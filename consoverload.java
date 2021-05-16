class Casios
{
    int num1, num2;
    String operation;
    public Casios()
    {
        num1 = 0;
        num2 = 0;
        operation = "no";
    }
    public Casios(int i)
    {
        num1 = i;
        num2 = 0;
        operation = "no";
    }
    public Casios(int i, int j)
    {
        num1 = i;
        num2 = j;
        operation = "no";
    }
    public Casios(int i, int j, String op) //constructor overloading
    {
        num1 = i;
        num2 = j;
        operation = op;
    }
}

    public class consoverload {
    public static void main(String[] args) {
        Casios c1 = new Casios(6);
        Casios c2 = new Casios(6, 9, "hr");
    }
}
