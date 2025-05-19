package interfaces;

import objects.Bird;
import objects.Pet;
import objects.Plane;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Plane p = new Plane();
        Bird b = new Bird();

        p.fly();
        b.fly();

        Flyable[] flyables = {p, b};

        for (Flyable flyable : flyables) {
            flyable.fly();
        }


    }
}
