// if later we want to extend more than one classes i.e. multiple inheritance we use interface as we can write it as
// interface C {}
// interface D {}
// class B extends A implements C 
// class B implements C, D

// class => extends
// interface => implements
// multiple cls can implement an interface
// A Class can extend one cls only but can implement any no. of interfaces


// interface same as abstract cls diff is in abstract cls we can define non-abstract method but in interface it will show error
// interface => by default public abstract methods
// interface only can declare method 


interface writer1
{
    /*public abstract*/ void write();
    
}
class Pen1 implements writer1
{
    public void write()
    {
        System.out.println("In a pen");
    }
}
class Pencil1 implements writer1
{
    public void write()
    {
        System.out.println("In a pencil");
    }
}
class Kit1
{
    public void doSomething(writer1 p)
    {
        p.write();
    }
}

public class InterfaceDemo 
{
    public static void main(String[] args) 
    {
        Kit1 k = new Kit1();
        // we can create reference of interface but cannot create object of interface
        writer1 p = new Pen1();
        writer1 pc = new Pencil1();

        k.doSomething(p);
        k.doSomething(pc);
    }
}
