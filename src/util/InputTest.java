package util;

public class InputTest {
    public static void main(String[] args) {
        Input i = new Input();

//        System.out.print("Please enter a string: ");
//        System.out.println(i.getString());

//        System.out.print("Yes or No: [y/yes][n/no] ");
//        System.out.println(i.yesNo());

//        System.out.print("Pick a number between 1 and 10, inclusive: ");
//        System.out.println(i.getInt(1, 10));

//        System.out.print("Enter your favorite number: ");
//        System.out.println(i.getInt());

//        System.out.print("Pick a floating point number between 1.0 and 10.0, inclusive: ");
//        System.out.println(i.getDouble(1.0, 10.0));

        System.out.print("Enter your favorite floating point number: ");
        System.out.println(i.getDouble());
    }
}
