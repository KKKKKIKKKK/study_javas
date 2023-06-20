package vehicles;

public class Scooter extends AbstractVehicle
{
    @Override
    public int speedUp (int val)
    {
        this.speed = this.speed + this.increment;
        return this.speed;
    }
}
