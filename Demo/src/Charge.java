interface Amount
{
    void chargeAmount(int distance);
}
class Bike implements Amount
{
    @Override
    public void chargeAmount(int distance)
    {
        System.out.println("Charge for Bike is : "+(distance*1.5));
    }
}
class Car implements Amount
{
    @Override
    public void chargeAmount(int distance)
    {
        System.out.println("Charge for Car is : "+(distance*3));
    }
}
class Truck implements Amount
{
    @Override
    public void chargeAmount(int distance)
    {
        System.out.println("Charge for Truck is : "+(distance*4));
    }
}
class Autorickshaw implements Amount
{
    @Override
    public void chargeAmount(int distance)
    {
        System.out.println("Charge for Autorickshaw is : "+(distance*2.5));
    }
}
public class Charge {
    public static void main(String[] args)
    {
        Bike bike = new Bike();
        bike.chargeAmount(50);
        Car car = new Car();
        car.chargeAmount(50);
        Truck truck = new Truck();
        truck.chargeAmount(50);
        Autorickshaw autorickshaw = new Autorickshaw();
        autorickshaw.chargeAmount(50);
    }
}
