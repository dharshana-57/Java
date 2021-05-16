abstract class writer
{
    public abstract void write();
    
}
class Pen extends writer
{
    public void write()
    {
        System.out.println("In a pen");
    }
}
class Pencil extends writer
{
    public void write()
    {
        System.out.println("In a pencil");
    }
}
class Kit
{
    public void doSomething(writer p)
    {
        p.write();
    }
}

public class AbstractExample 
{
    public static void main(String[] args) 
    {
        Kit k = new Kit();
        writer p = new Pen();
        writer pc = new Pencil();

        k.doSomething(p);
        k.doSomething(pc);

        //  Pencil pc = new Pencil();
        // k.doSomething(pc); => show error bcoz doSomething only  accepts pen objects => for this we are creating a class named writer and extending it to pen and pencil and with writer obj reference we are creating pen and pencil objects (dynamic method dispatch) and doSomething parameter changed to writer object 

    }
}
