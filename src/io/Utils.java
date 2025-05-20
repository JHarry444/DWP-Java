package io;


import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;


public class Utils implements Closeable {


    private final Scanner scanner;

    public Utils(Scanner scanner) {
        super();
        this.scanner = scanner;
    }

    public Utils() {
        scanner = new Scanner(System.in);
    }

    public Long getLong() {
        String input = null;
        Long longInput = null;
        do {
            try {
                input = getString();
                longInput = Long.parseLong(input);
            } catch (NumberFormatException nfe) {
                System.out.println("Error - Please enter a number");
            }
        } while (longInput == null);
        return longInput;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public Double getDouble() {
        String input = null;
        Double doubleInput = null;
        do {
            try {
                input = getString();
                doubleInput = Double.parseDouble(input);
            } catch (NumberFormatException nfe) {
                System.out.println("Error - Please enter a number");
            }
        } while (doubleInput == null);
        return doubleInput;
    }

    @Override
    public void close() throws IOException {
        scanner.close();
    }
}