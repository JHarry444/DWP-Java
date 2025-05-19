package objects;

import interfaces.Flyable;

public class Bird extends Pet implements Flyable {


    @Override
    public void makeNoise() {
        System.out.println("CAW CAW");
    }

    @Override
    public void fly() {
        System.out.println("FLAP FLAP");
    }
}
