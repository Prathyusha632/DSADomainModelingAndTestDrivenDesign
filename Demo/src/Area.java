class Shapes
{
    void findArea(int base, int height)
    {
        System.out.println("Area of parallelogram is : "+ (base*height));
    }
    void findArea(int radius)
    {
        System.out.println("Area of Cylinder is : "+ (Math.PI*Math.pow(radius, 2)));
    }
}
class Rhombus extends Shapes
{
    @Override
    void findArea(int diagonal1, int diagonal2)
    {
        System.out.println("Area of Rhombus is : "+ (diagonal1*diagonal2/2));
    }
}
public class Area {
    public static void main(String[] args)
    {
        Shapes parallelogram = new Shapes();
        parallelogram.findArea(3,4);
        Shapes cylinder = new Shapes();
        cylinder.findArea(4);
        Shapes rhombus = new Rhombus();
        rhombus.findArea(4,5);
    }
}
