import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100) + 1;
        int count = 1;

        System.out.print("I thinking of a number between 1 and 100, inclusive. What is it? ");
        System.out.print(highLow(randomNum, 1, 100, count));
    }

    public static String highLow(int randomNum, int min, int max, int count) {
        Scanner input = new Scanner(System.in);
        int playerNum = input.nextInt();
        String message = "";

        if(playerNum < 1 || playerNum > 100) {
            System.out.print("You entered and invalid number. Please enter a number between 1 and 100: ");
            return highLow(randomNum, min, max, count);
        } else {
            if(playerNum == randomNum) {
                message = "GOOD GUESS! I only took you " + count + " guess(es)!";
            } else if(playerNum < randomNum) {
                System.out.println("HIGHER!");
                System.out.print("Enter a number higher than " + playerNum + ": ");
                count++;
                return highLow(randomNum, min, max, count);
            } else {
                System.out.println("LOWER!");
                System.out.print("Enter a number lower than " + playerNum + ": ");
                count++;
                return highLow(randomNum, min, max, count);
            }
        }

        return message;
    }
}
