import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//
//        while(i <= 15) {
//            System.out.printf("%d ", i);
//            i++;
//        }

//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);

//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);

//        for(int i = 5; i <= 15; i++) {
//            System.out.printf("%d ", i);
//        }

//        for(int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for(int i = 1; i <= 100; i++) {
//            if(i % 5 == 0 && i % 3 == 0 ) {
//                System.out.println("FizzBuzz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner input = new Scanner(System.in);

//        String choice = "";
//
//        do {
//            System.out.print("Please enter a number: ");
//            int num = input.nextInt();
//
//            System.out.printf("number | squared | cubed%n");
//            System.out.printf("------ | ------- | -----%n");
//
//            for (int i = 1; i <= num; i++) {
//                System.out.printf("%-6d | %-7d | %-5d%n", i, (i * i), (i * i * i));
//            }
//
//            System.out.println("Would you like to continue? [Y/N]");
//            choice = input.next();
//        } while(choice.equalsIgnoreCase("Y"));

        String choice = "";

        do {
            System.out.print("Please enter a grade (0 - 100): ");
            int grade = input.nextInt();

            if(grade >= 88 && grade <= 100) {
                System.out.printf("With a grade of %d, the student got an A!%n", grade);
            } else if(grade >= 80 && grade <= 87) {
                System.out.printf("With a grade of %d, the student got an B!%n", grade);
            } else if(grade >= 67 && grade <= 79) {
                System.out.printf("With a grade of %d, the student got an C.%n", grade);
            } else if(grade >= 60 && grade <= 66) {
                System.out.printf("With a grade of %d, the student got an D.%n", grade);
            } else {
                System.out.printf("With a grade of %d, the student got an F.%n", grade);
            }

            System.out.println("Would you like to continue? [Y/N]");
            choice = input.next();
        } while(choice.equalsIgnoreCase("Y"));
    }
}