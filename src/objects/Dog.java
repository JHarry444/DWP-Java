package objects;

//               IS A
public class Dog extends Pet{

    public Dog() {
        super(); // trying to call new Pet();
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String color, int age, String breed, boolean asleep, int weight, int noOflegs) {
        super(color, age, breed, asleep, weight, noOflegs);
    }

    @Override
    public void makeNoise() {
        System.out.println("WOOF!");
    }

    public void fetch() {
        System.out.println("Good boi!");
    }
}
