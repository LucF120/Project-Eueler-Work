public class Problem4 {
    public static void main(String[] args) {
        int numOne = 999;
        int numTwo = 999;

        int largestPalindrome = 0;
        for (int i = 899; i >= 0; i--) {
            for (int j = 899; j >= 0; j--) {
                int value = numOne * numTwo;
                String str = String.valueOf(value);
                if (str.equals(reverseString(str))) {
                    if (value > largestPalindrome) {
                        largestPalindrome = value;
                    }
                }
                numOne = numOne - 1;
            }
            numTwo = numTwo - 1;
            numOne = numTwo;
        }
        System.out.println(largestPalindrome);
    }

    public static String reverseString(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);
        }
        return output;
    }
}