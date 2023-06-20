package vehicles;

public class Scooter extends AbstrsactVehicle{

        private static final int increment = 0;

        @Override
        public int speedUp (int val) {
            this. speed = this. speed +this.increment ; 
            return  this.speed ; 
        }
}
