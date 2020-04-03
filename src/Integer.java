import util.Input;

public class Integer {
    public static void main(String[] args) {
        Input i = new Input();

        try {
            System.out.print("Enter your favorite integer: ");
            int intNum = i.getInt();
            System.out.println(intNum);
        } catch(NumberFormatException nfe) {
//            nfe.printStackTrace();
            System.out.println("Uh oh, something went wrong: " + nfe.getMessage());
        }

        System.out.println();

        try {
            System.out.print("Enter your favorite floating point number: ");
            double doubleNum = i.getDouble();
            System.out.println(doubleNum);
        } catch(NumberFormatException nfe) {
            nfe.printStackTrace();
        }

        System.out.println();

        try {
            System.out.print("Let's parse a binary string: ");
            int binary = i.getBinary();
            System.out.println(binary);
        } catch(NumberFormatException nfe) {
            nfe.printStackTrace();
        }

        System.out.println();

        try {
            System.out.print("Let's parse a hexadecimal number: ");
            int hex = i.getHex();
            System.out.println(hex);
        } catch(NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }
}
