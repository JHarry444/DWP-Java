package objects;

import interfaces.Flyable;

public class Plane implements Flyable {

    private String colour;
    private String type;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public void fly() {
        System.out.println("NYOOM");
    }
}
