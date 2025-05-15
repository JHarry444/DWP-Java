package objects;

public class Cat {

    String colour;
    int age;
    String breed;
    boolean hasWhiskers = true;
    boolean tail = true;
    boolean asleep = false;
    int weight;
    int lives = 9;
    int noOflegs = 4;

    public Cat() {

    }

    public Cat(int age, int lives, String breed, String colour) {
        this.age = age;
        this.lives = lives;
        this.breed = breed;
        this.colour = colour;
    }


    int getHumanAge() {
        return this.age * 7;
    }

    void sleep() {
        this.asleep = true;
    }

    void wakeUp() {
        this.asleep = false;
    }


}
