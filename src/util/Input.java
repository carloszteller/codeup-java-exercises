package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    String getString() {
        return scanner.next();
    }

    boolean yesNo() {
        String s = scanner.next();
        return s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes");
    }

    int getInt(int min, int max) {
        int i = scanner.nextInt();
        if(i < min || i > max) {
            System.out.printf("Invalid number! Please enter a number between %d and %d, inclusive: ", min, max);
            return getInt(min, max);
        } else {
            return i;
        }
    }

    int getInt() {
        return scanner.nextInt();
    }

    double getDouble(double min, double max) {
        double d = scanner.nextDouble();
        if(d < min || d > max) {
            System.out.printf("Invalid number! Please enter a number between %.2f and %.2f, inclusiv: ", min, max);
            return getDouble(min, max);
        } else {
            return d;
        }
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
