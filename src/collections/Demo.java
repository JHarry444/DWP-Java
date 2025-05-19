package collections;

import objects.Cat;
import objects.Dog;

import java.util.*;

public class Demo {


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};

        String[] names = {"Jordan", "Cameron", "Shafeeq", "Sam A", "Sam C"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("I: " + i + " Name: " + names[i]);
        }


        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(3);
        numList.add(5);
        numList.add(7);
        numList.add(9);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println("I: " + i + " Nu,: " + numList.get(i));
        }

        numList.remove(0);

        System.out.println("NUMS: " + numList);
//    Unordered and unique
        Set<Integer> numSet = new HashSet<>();

        numSet.add(1);
        numSet.add(1);
        numSet.add(1);
        numSet.add(1);
        numSet.add(1);

        System.out.println("NUMSET:" + numSet);

        HashMap<Integer, Cat> map = new HashMap<>();

        map.put(4494, new Cat(12, 9, "Black", "Irish Shorthair"));
        map.put(1234, new Cat(34, 2, "White", "Manx"));
        map.put(4578, new Cat(13, 5, "Blue", "Siamese"));
        map.put(6574, new Cat(2, 9, "Green", "Persian"));


        for(Map.Entry<Integer, Cat> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "\n Value: " + entry.getValue());
        }

        System.out.println(map.get(6574));
    }
}
