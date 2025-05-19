package interfaces;

// like an abstract class
// JUST methods
// not what things ARE they're what they DO
public interface Flyable {

    // constant
    int MAX_HEIGHT = 999_999;

    // all interface methods are inherently public + abstract
    void fly();


//    can provide a default implementation
//    default void fly() {
//        System.out.println("I'm flying!");
//    }
}
