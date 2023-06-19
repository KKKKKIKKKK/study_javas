package vehicles;

public class RoadCycle extends Bicycle
{
    int seatHight;
    private String name;
    public RoadCycle()
    {

    }
    public RoadCycle(int price, String color, String name)
    {
        this. name = name;
        super.price = price;
        super.color = color;
    }

    public String toString()
    {
        String str = " price: " + super.price + " " + " color: " + super.color + " " + "name: " + this.name;
        return str;
    }
}
