public class getClassDemo
{
    public static void main(String args[])
    {
        getClassDemo ob1 = new getClassDemo(); 
        System.out.println(ob1.getClass()); 
        String name="test";
        System.out.println(name.getClass()); // Obtains the class which the objects belongs
    }
}