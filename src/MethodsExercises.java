import java.util.Scanner;

public class MethodsExercises {
    // Basic Arithmetic
    public static void main(String[] args) {
        // System.out.println(addition(1, 2));
        // System.out.println(subtraction(1, 2));
        // System.out.println(multiplication(5, 2));
        // System.out.println(division(6, 2));
        // System.out.println(modulus(5, 2));

        // System.out.print("Please enter a number between 1 and 10: ");
        // int userInput = getInteger(1, 10);
        // System.out.printf("Your valid number: %d", userInput);

        Scanner input = new Scanner(System.in);
        String again;
//
//        do {
//            System.out.print("Please enter a number bewteen 1 and 10, inclusive: ");
//            int userNum = input.nextInt();
//
//            System.out.print(userNum + "! = ");
//            System.out.print(" = " + factorial(userNum, 1));
//
//            System.out.print("\nWould you like to enter another number? [Y/N] ");
//            again = input.next();
//        } while(again.equalsIgnoreCase("Y"));

//        do {
//            System.out.print("Enter the number of sides for for the pair of dice: ");
//            int numSides = input.nextInt();
//
//            rollDice(numSides);
//
//            System.out.print("\nWould you like to play again? [Y/N] ");
//            again = input.next();
//        } while(again.equalsIgnoreCase("Y"));
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        // return num1 * num2;

        // for(int i = 1; i < num2; i++) {
        //     num1 += num1;
        // }

        if(num2 > 0) {
            num1 += num1;
            num2--;

            multiplication(num1, num2);
        }

        return num1;
    }

    public static int division(int num1, int num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("Attempted to divide by zero.");
        }

        return num1  / num2;
    }

    public static int modulus(int num1, int num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("Attempted to divide by zero.");
        }

        return num1 % num2;
    }

    // Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max) {
        Scanner userInput = new Scanner(System.in);
        int userNum = userInput.nextInt();

        if(userNum < min || userNum > max) {
            System.out.print("Invalid Number! Please enter a number between 1 and 10: ");
            return getInteger(min, max);
        }

        return userNum;
    }

    // Calculate the factorial of a number
    public static int factorial(int num, int fact) {
        if (num >= fact) {
            System.out.print(fact);

            if (fact < num) {
                System.out.print(" * ");
            }

            return fact * factorial(num, fact + 1);
        } else {
            return 1;
        }
    }

    // Create an application that simulates dice rolling
    public static void rollDice(int sides) {
        System.out.println("You rolled a " + randomNumber(sides) + " and a " + randomNumber(sides));
    }

    public static int randomNumber(int sides) {
        return (int) (Math.random() * sides) + 1;
    }
}
