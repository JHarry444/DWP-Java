package objects;

public class Pet extends Object  {

    private String color;
    private int age;
    private String breed;
    private boolean asleep = false;
    private int weight;
    private int noOflegs = 4;

    public Pet() {
    }


    public Pet(String color, int age, String breed, boolean asleep, int weight, int noOflegs) {
        this.color = color;
        this.age = age;
        this.breed = breed;
        this.asleep = asleep;
        this.weight = weight;
        this.noOflegs = noOflegs;
    }

    public void makeNoise() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isAsleep() {
        return asleep;
    }

    public void setAsleep(boolean asleep) {
        this.asleep = asleep;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNoOflegs() {
        return noOflegs;
    }

    public void setNoOflegs(int noOflegs) {
        this.noOflegs = noOflegs;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", asleep=" + asleep +
                ", weight=" + weight +
                ", noOflegs=" + noOflegs;
    }
}
