package exceptions;

import objects.Dog;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();



    public boolean addDog(Dog dog) {
        return dogs.add(dog);
    }

    public boolean removeDog(Dog dog) {
        return dogs.remove(dog);
    }

    // throws -> warning in method signature that an exception could be thrown
    public Dog findDog(String name) throws DogNotFoundException {
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                return dog;
            }
        }
        // throw -> creates a new exception
        throw new DogNotFoundException("No dog found with name: " + name);
    }
}
