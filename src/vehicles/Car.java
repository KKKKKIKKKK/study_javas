package vehicles;

public class Car implements Vehicle
{

    int speed = 20;
    int increment = 0;

    @Override
    public int speedup(int val)
    {
        this.speed = this.speed + increment;
        return this.speed;
    }

    public int speedDown(int val)
    {
        this.speed = this.speed - increment;
        return this.speed;
    }
}
