package vehicles;

abstract public class AbstractVehicle
{
    int speed =0; 
<<<<<<< HEAD
    int increment = 5;
    public int speedUp (int val); 
    public int speedDown (int val)
    {
=======
    int increment =5;
    public int speedUp (int val) ; 
    public int speedDown (int val) {
>>>>>>> 7384654a0d39b8879414eac09f75aa3c6175906f
        this.speed = this .speed - this.increment ; 
        return this.speed ; 
    }
}
