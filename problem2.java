public class problem2 {
    public static void main(String[] args) {
        int sum = 0;
        int previousFib = 1;
        int currentFib = 2;
        while (previousFib < 4000000) {
            if (previousFib % 2 == 0) {
                sum = sum + previousFib;
            }
            int temp = currentFib;
            currentFib = previousFib + currentFib;
            previousFib = temp;
        }
        System.out.println(sum);
    }
}
