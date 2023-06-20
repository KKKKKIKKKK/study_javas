package animals;

public class HumanAnimal extends HumanAnimalExtend
{
    public String toString()
    {
        String str = "Legs : " + this.setLegs + ", Arms : " + this.setArms + ", Speech : " + this.setEnableSpeech;
        return str;
    }
        public String getSpeed()
        {
        HumanAnimalExtend humanAnimalExtend = new HumanAnimalExtend();
        this.speed = humanAnimalExtend.speed(1);
        String spd = "Speed : " + this.speed + "km";
        return spd;
    }
}