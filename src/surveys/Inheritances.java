package surveys;

import Inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.MountainBike;
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

            // 상속해 활용
            // MountainBike mountainBike = new MountainBike();
            // MountainBike mountainBike = new MountainBike(6200, "yellow", 5);

            RoadCycle roadCycle = new RoadCycle("제품명", "red", 18600);
            System.out.println();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}