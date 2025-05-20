package exceptions;

import objects.Dog;

import java.util.Scanner;
import java.util.function.Predicate;

public class Demo {

//    Exceptions tell you that you've done something wrong (recoverable)
//    Errors tell you you've done something VERY wrong (not recoverable)
//    Throwable is the parent of both

    public static void main(String[] args) {
        String s = null;

//        s.charAt(0); NullPointer EXCEPTION

//        main(null); StackOverflow ERROR

        getNumber("Enter a number from 1 - 10:", num -> num >= 1 && num <= 10);

        Kennel k = new Kennel();
        k.addDog(new Dog("Rex"));
        k.addDog(new Dog("Barry"));
        k.addDog(new Dog("Larry"));

        try {
            System.out.println(k.findDog("Harry"));
        } catch (DogNotFoundException e) {
            System.out.println(e.getMessage());;
        }

    }

    public static int getNumber(String message, Predicate<Integer> predicate) {
        int num = 0;
        try (Scanner scanner = new Scanner(System.in)) { // try with resources automatically closes scanner when done
            do {
                System.out.println(message);
                try {
                    num = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: Not A Number");
                }

                if (!predicate.test(num)) {
                    System.out.println("Invalid Number!");
                }
            } while (!predicate.test(num));
        } catch (Exception e) {
            System.out.println("OOPS!");
        }
//        finally {
//            scanner.close(); // always runs (makes sure the scanner isn't taking up resources behind the scenes)
//        }
        return num;
    }
}
