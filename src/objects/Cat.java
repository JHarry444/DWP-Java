package objects;

public class Cat extends Pet {

    private int lives = 9;
    private boolean hasWhiskers = true;
    private boolean tail = true;

    public Cat() {

    }

    public Cat(int age, int lives, String colour, String breed) {
        this.setAge(age);
        this.setLives(lives);
        this.setColor(colour);
        this.setBreed(breed);
    }

    int getLives() {
        return this.lives;
    }

    @Override
    public void makeNoise() {
        System.out.println("MEOW");
    }

    void setLives(int lives) {
        if (lives >= 0 && lives <= 9) {
            this.lives = lives;
        } else {
            System.out.println("Invalid number of lives: " + lives);
        }
    }


    public boolean isHasWhiskers() {
        return hasWhiskers;
    }

    public void setHasWhiskers(boolean hasWhiskers) {
        this.hasWhiskers = hasWhiskers;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "lives=" + lives +
                ", hasWhiskers=" + hasWhiskers +
                ", tail=" + tail +
                ", " + super.toString() +
                '}';
    }
}
