public class Warmups {
    public static void main(String[] args) {
//        int[] numArray = { 10, 15, 3, 7 };
//        int k = 17;
//
//        for(int i : numArray) {
//            for(int j = 1; j < numArray.length; j++) {
//                if(i + numArray[j] == k) {
//                    System.out.println(i + " + " + numArray[j] + " = " + k);
//                    break;
//                }
//            }
//        }

        System.out.println(isPalindrome("racecar"));
    }

    public static Boolean isPalindrome(String s) {
        String reverse = "";

        for(int i = s.length() - 1; i > 0; i--) {
            reverse += s.charAt(i);
        }

        return s.equalsIgnoreCase(reverse);
    }
}
