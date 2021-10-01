class Sample
{
    int value;

    Sample()
    {
        this("Passed_value");
    }

    public Sample(String str)
    {
        System.out.println(str + " by this()");
    }

    public void setValue (int value)
    {
        this.value = value;
    } 
}
public class thisDemo
{
    public static void main(String[] args)
    {
        Sample obj = new Sample();
        
        obj.setValue(123);
        System.out.println(obj.value);
    }
}

