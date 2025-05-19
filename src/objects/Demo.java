package objects;

public class Demo {


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setAge(32);
        cat1.setLives(8);
        cat1.setBreed("Scottish short hair");
        cat1.setColor("blue");
        Cat cat2 = new Cat(12, 9, "Tabby", "Orange");

        System.out.println("Cat 1 age: " + cat1.getAge());
        System.out.println("Cat 2 age: " + cat2.getAge());

        System.out.println("Cat 1 asleep: " + cat1.isAsleep());
        cat1.setAsleep(true);
        System.out.println("Cat 1 asleep: " + cat1.isAsleep());

        cat1.setLives(-27);
        System.out.println("Cat 1 lives: " + cat1.getLives());
        cat1.setLives(27);
        System.out.println("Cat 1 lives: " + cat1.getLives());
        cat1.setLives(6);
        System.out.println("Cat 1 lives: " + cat1.getLives());
        cat1.setLives(99);

        System.out.println(cat1);

        Dog d = new Dog();
        d.setAge(12);
        d.setColor("Brown");
        d.fetch();

//        Pet pp = new Pet(); cant instantiate Pet if it's abstract
        Pet p = new Dog();
        p.setAge(22);
//        p.fetch();  cant fetch because java doesnt know p is a dog
        Pet p2 = new Cat();

        Object o = new Cat();
        o = new Dog();
        o = "hello";
        o = 12;

        Cat c1 = new Cat();
        c1.makeNoise();

        new Dog().makeNoise();

        new Bird().makeNoise();
        
        Pet p1 = new Cat();
        p1.makeNoise();

        Dog d1 = new Dog();
                           d1.fetch();
        Pet p3 = d1;
        p3.fetch();
    }
}
