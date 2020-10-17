public class finalizeDemo
{
    public static void main(String args[])
    {
        finalizeDemo ob1 = new finalizeDemo();
        Runtime r = Runtime.getRuntime();
        ob1 = null;
        r.gc();
    }
    protected void finalize()
    {
        System.out.println("I am finalize");
    }
}