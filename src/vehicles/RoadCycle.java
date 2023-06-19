package vehicles;

public class RoadCycle extends Bicycle
{
    String name;
    public RoadCycle(String name, String color, int price)
    {
        this.name = name;
        this.color = color;
        this.price = price;
    }
        public String toString()
    {
        String str = "name: " + this.name + this.price + " " + "color: " + this.color;
        return str;
    }
}
