public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int myFavoriteNumber = 999;
        System.out.println(myFavoriteNumber);

        String myString = "a string value";
        System.out.println(myString);

        // char myChar = myString; // Error: Required type: char; Provided: String

        // myString = 3.14159 // Error: Required type: String; Provided: double

        // long myNumber;
        // System.out.println(myNumber); // Error: variable myNumber might not have been initialized

        // myNumber = 3.14; // Error: Required type: long; Provided: double
        // myNumber = 123L;
        // System.out.println(myNumber);
        // myNumber = 123;
        // System.out.println(myNumber);
        // float myNumber = 3.14; // Error: Required type: double; Provided: float
        double myNumber = 3.14; // OR float myNumber = (float) 3.14
        System.out.println(myNumber);

        // int x = 5;
        // System.out.println(++x); // Outputs 6 while System.out.println(x++); outputs 5 -- pre vs post incrementer
        // System.out.println(x);

        // int class = 1; Error: identifier expected

        String theNumberThree = "three";
        Object o = theNumberThree;
        // int three = (int) o;
        // System.out.println(three); // Error: Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap') at HelloWorld.main(HelloWorld.java:35)

        // int three = (int) "three"; // Error: Incovertible types; cannot cast 'java.lang.String' to 'int'

        // int x = 4;
        // x += 5; // x = x + 5;

        // int x = 3;
        // int y = 4;
        // y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
    }
}