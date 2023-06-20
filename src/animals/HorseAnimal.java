package animals;

public class HorseAnimal extends HorseAnimalExtend
{
    public String toString()
    {
        String str = "Legs : " + this.setLegs + ", Arms : " + this.setArms + ", Speech : " + this.setEnableSpeech;
        return str;
    }
    public String getSpeed()
    {
        HorseAnimalExtend horseAnimalExtend = new HorseAnimalExtend();
        this.speed = horseAnimalExtend.speed(2);
        String spd = "Speed : " + this.speed + "km";
        return spd;
    }
}