public class Problem6 {
    public static void main(String[] args) {
        long sumOfSquares = 0;
        long squareOfSum = 0;

        long firstHundredSum = 0;
        for(long i=1 ; i<101 ; i++) {
            firstHundredSum += i;
            sumOfSquares += (i*i);
        }
        squareOfSum = firstHundredSum*firstHundredSum;
        System.out.println(squareOfSum - sumOfSquares);
    }
}