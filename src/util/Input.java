package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        String s = scanner.next();
        return s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int i = scanner.nextInt();
        if(i < min || i > max) {
            System.out.printf("Invalid number! Please enter a number between %d and %d, inclusive: ", min, max);
            return getInt(min, max);
        } else {
            return i;
        }
    }

    public int getInt() {
//        return scanner.nextInt();
        return Integer.valueOf(getString());
    }

    public double getDouble(double min, double max) {
        double d = scanner.nextDouble();

        if(d < min || d > max) {
            System.out.printf("Invalid number! Please enter a number between %.2f and %.2f, inclusiv: ", min, max);
            return getDouble(min, max);
        } else {
            return d;
        }
    }

    public double getDouble() {
//        return scanner.nextDouble();
        return Double.valueOf(getString());
    }

    public int getBinary() {
        return Integer.valueOf(getString(), 2);
    }

    public int getHex() {
        return Integer.valueOf(getString(), 16);
    }
}
