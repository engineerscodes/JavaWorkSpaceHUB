class Shape
{
    float length, breadth, height;
    float result;

    Shape()
    {
        System.out.println("Shapes:");
    }
    Shape (float length, float breadth)
    {
        result = length * breadth;
        System.out.println("Area of rectangle: " + result);
    }

    Shape (float length, float breadth, float height)
    {
        result = length * breadth * height;
        System.out.println("Area of triangle: " + result);
    }
}

public class constructorDemo
{
    public static void main(String[] args)
    {
        new Shape();
        new Shape(54f, 12f);
        new Shape(48f, 24f, 45f);
    }
}