
class Outer
{
    void show()
    {
        System.out.println("In show() : Outer");
    }

    class Inner1 // Member Class
    {
        public void display()
        {
             System.out.println("In display() : Inner1");
        }
    }

    static class Inner2 // Satic Class
    {
        public void display()
        {
             System.out.println("In display() : Inner2");
        }
    }

}

public class InnerClass
{
    public static void main(String[] args)
    {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner1 In1 = obj.new Inner1();
        In1.display();

        Outer.Inner2 In2 = new Outer.Inner2();
        In2.display();

    }
}