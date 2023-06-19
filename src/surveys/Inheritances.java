package surveys;

import java.util.HashMap;
import java.util.Map;

// import Inheritances.ObjectInheritances;
// import vehicles.Bicycle;
import vehicles.Bike;
import vehicles.Car;
// import vehicles.MountainBike;
// import vehicles.RoadCycle;
import vehicles.Vehicle;

public class Inheritances
{
    public static void main(String[] args)
    {
        try
        {
            // Object 확인
            // ObjectInheritances objectInheritances = new ObjectInheritances();

            // 상속할 class 생성
            // Bicycle bicycle = new Bicycle(5500, "blue");
            // System.out.println(bicycle.toString());

            // mountain 상속해 활용
            // MountainBike mountainBike = new MountainBike();
            // MountainBike mountainBike = new MountainBike(6200, "yellow", 5);
            // System.out.println();

            // RoadCycle roadCycle = new  RoadCycle (10000, "blue", "정지운 자전거 ");
            //  System.out.println(roadCycle);

            // 구현하고 호출하기
            Car car = new Car();
            int speed = car.speedUp(1);
            speed = car.speedDown(2);

            Vehicle bike = new Bike();
            Vehicle car_second = new Car();
            System.out.println();

            Map<String, String> hashMap = new HashMap<>();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}