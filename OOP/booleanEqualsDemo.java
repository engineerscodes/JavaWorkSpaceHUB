class testClass
{
}
public class booleanEqualsDemo {
    public static void main(String[] args) {
        testClass obj1 = new testClass();
        testClass obj2 = new testClass();
        System.out.println(obj1.equals(obj1));
        System.out.println(obj1.equals(obj2)); // checks if the obejcets are equal
        System.out.println("Welcome".equals("Welcome"));
    }
}