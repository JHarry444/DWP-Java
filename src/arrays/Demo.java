package arrays;

import objects.Cat;
import objects.Dog;
import objects.Pet;

import java.util.Arrays;
import java.util.List;

public class Demo {


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        nums[0] = 11;

        nums[nums.length - 1] = 110;

        String[] words = {"Hello", "WORLD!"};

        int[] even = new int[10];

        for (int i = 0; i < even.length; i++) {
            System.out.println("I: " + i + " NUM: " + even[i]);
        }

        for (int i = 0; i < even.length; i++) {
            even[i] = 2 * (i + 1);
        }

        for (int i = 0; i < even.length; i++) {
            System.out.println("I: " + i + " NUM: " + even[i]);
        }

        System.out.println("EVEN: " + even);

        for (int num : even) {
            System.out.println("EVEN: " + num);
        }
        Arrays.stream(even).reduce(Integer::sum);


        List.of(3,1,4).toArray();
        Pet[] pets = {new Cat(), new Dog()};
    }
}
