package animals;

public class AnimalMain
{
    public static void main(String[] args)
    {
        try
        {
        HumanAnimal humanAnimal = new HumanAnimal();
        System.out.println(humanAnimal.toString());
        System.out.println(humanAnimal.getSpeed());

        HorseAnimal horseAnimal = new HorseAnimal();
        System.out.println(horseAnimal.toString());
        System.out.println(horseAnimal.getSpeed());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}