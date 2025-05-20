package lambdas;

import java.util.List;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {
        Consumer<String> print = str -> System.out.println(str);

        print.accept("YO!");

        Calculation add = (a, b) -> a + b;

        Calculation subtract = new Calculation() {
            @Override
            public double calculate(double a, double b) {
                return a - b;
            }
        };

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        nums.stream().map(num -> num * num).forEach(System.out::println);

        System.out.println("SUM: " + nums.stream().reduce((accumulator, next) -> accumulator + next));


        nums.stream().filter(num -> {
            return num % 2 == 0;
        }).forEach(num -> System.out.println(num));

        List<Integer> num2 = List.of(213, 453, 5, 3, 53, 43, 3453, 453, 5, 356);

        System.out.println("MAX: "+ num2.stream().reduce(0, (biggest, next) -> {
            if (next > biggest) return next;
            else return biggest;
        }));
        System.out.println("MAX: "+ num2.stream().reduce(0, (biggest, next) -> Math.max(biggest, next)));

        System.out.println("MAX: "+ num2.stream().reduce(0, Math::max));

        nums.stream().filter(Demo::isEven).forEach(System.out::println);
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
