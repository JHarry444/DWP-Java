package objects;

public class Cat extends Pet {

    private int lives = 9;
    private boolean hasWhiskers = true;
    private boolean tail = true;

    public Cat() {

    }


    int getLives() {
        return this.lives;
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


}
