package surveys;

import Inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.Car;
// import vehicles.MountainBike;
import vehicles.RoadCycle;

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
            int speed = car.speedup(1);
            speed = car.speedDown(2);
            System.out.println();


        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}