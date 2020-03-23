import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bob: Hey buddy, how's it going? ");
        String answer = input.nextLine();

        if(answer.endsWith("?")) {
            System.out.println("Sure.");
        } else if(answer.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if(answer.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
