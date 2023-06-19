package vehicles;

public class RoadCycle extends Bicycle
{
<<<<<<< HEAD
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
=======
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
>>>>>>> 8b3467482eb8f444913484250930d8ebd693c356
        return str;
    }
}
