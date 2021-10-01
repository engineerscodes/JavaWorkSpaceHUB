class Pet
{
    String name;                          // Instance variables
    int count;
    
    public void setName(String name)       
    {
        this.name = name;
    }

    public void setCount(int count)        
    {
        this.count = count;
    }

    void getName()                        
    {
        System.out.println("Pet: "+ name);
    }

    void getCount()                       
    {
        System.out.println("Count: " + count);
    }
}

public class classDemo
{
    public static void main(String[] args)
    {
        Pet obj = new Pet();

        obj.setName("Dog");
        obj.setCount(10);

        obj.getName();
        obj.getCount();

        obj.setName("Cat");
        obj.setCount(7);

        obj.getName();
        obj.getCount();
    }
}