package surveys;

import java.util.HashMap;
import java.util.Map;

import Inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.Bike;
import vehicles.Car;
// import vehicles.MountainBike;
import vehicles.RoadCycle;
import vehicles.Scooter;
<<<<<<< HEAD
import vehicles.Vehicle;
=======
>>>>>>> 7384654a0d39b8879414eac09f75aa3c6175906f

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
            // System.out.println(★ bicycle.toString());

            // mountain 상속해 활용
            // MountainBike mountainBike = new MountainBike();
            // MountainBike mountainBike = new MountainBike(6200, "yellow", 5);
            // System.out.println(★ mountainBike.toString());

            // RoadCycle roadCycle = new RoadCycle (10000, "blue", "정지운 자전거 ");
            // System.out.println(roadCycle .toString());

            // 구현하고 호출하기
            // Car car = new Car();

            // int speed = car.speedUp(1);
            // speed = car.speedDown(2);

            // Bike bike = new Bike();
            // Vehicle car_second = new Vehicle(); 
             
            // System.out.println();

            // Map<String, String> hashMap = new HashMap<>(); 

            //스쿠터 추상화 확인 
            Scooter scooter = new Scooter();
            System.out.println();

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}