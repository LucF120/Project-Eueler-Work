public class Problem7 {
    public static void main(String[] args) {
        long currentIndex = 15;
        long numOfPrimes = 6;    
        while(numOfPrimes < 10001) {
            currentIndex+=2;
            if(isPrime(currentIndex)) {
                numOfPrimes++;
            }
        }

        System.out.println(currentIndex);
    }

    public static boolean isPrime(long number) {
        for(long i=3 ; i<number ; i+=2) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}