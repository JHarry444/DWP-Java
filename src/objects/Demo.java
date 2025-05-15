package objects;

public class Demo {


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 32;
        cat1.lives = 8;
        cat1.breed = "Scottish short hair";
        cat1.colour = "blue";
        Cat cat2 = new Cat(12, 9, "Tabby", "Orange");

        System.out.println("Cat 1 age: " + cat1.age);
        System.out.println("Cat 2 age: " + cat2.age);
    }
}
