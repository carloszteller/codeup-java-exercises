public class Warmups {
    public static void main(String[] args) {
        int[] numArray = { 10, 15, 3, 7 };
        int k = 17;

        for(int i : numArray) {
            for(int j = 1; j < numArray.length; j++) {
                if(i + numArray[j] == k) {
                    System.out.println(i + " + " + numArray[j] + " = " + k);
                    break;
                }
            }
        }
    }
}
