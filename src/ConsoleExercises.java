import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        // System.out.print("Please enter a number: ");
        // int num = input.nextInt(); // If input is not a number, exception thrown
        // System.out.printf("Number: %d", num);

        // System.out.print("Enter your 3 favorite words: ");
        // String word1 = input.next();
        // String word2 = input.next();
        // String word3 = input.next(); // If less than three words entered, it will wait until a 3rd has been entered
        // System.out.printf("Words:%n%s%n%s%n%s%n", word1, word2, word3); // If more than three entered, it will only take the first three

        // System.out.print("Enter a sentence: ");
        // String sentence = input.next();
        // System.out.printf("Your sentence: %s", sentence); // using the .next() only the first word is captured

        System.out.print("Enter the length, width and height of the Codeup classroom: ");
        int length = input.nextInt();
        int width = input.nextInt();
        int height = input.nextInt();

        int area = length * width;
        System.out.printf("The area of the Codeup classroom is: %d.", area);

        int volume = length * width * height;
        System.out.printf("The volume of the Codeup classroom is: %d.", volume);
    }
}