public class Problem10 {
    public static void main(String[] args) {
        long sum = 17L;
        long[] primes = new long[2000000];
        primes[0] = 2L;
        primes[1] = 3L;
        primes[2] = 5L;
        primes[3] = 7L;
        int primesIndex = 4;
        for(long i=9 ; i<2000000 ; i+=2) {
            System.out.println("INDEX: " + i);
            if(isPrime(i, primes, primesIndex)) {
                sum = sum + i;
                primes[primesIndex] = i;
                primesIndex++;
            }
        }

        System.out.println(sum);
    }

    //The algorithm used here checks if the number is divisble by any of the primes that are <= the
    //square root of the number 
    public static boolean isPrime(long num, long[] primes, int primesIndex) {
        for(int i=0 ; i<primesIndex ; i++) {
            if(primes[i] > Math.sqrt(num)) {
                return true;
            }
            if(num % primes[i] == 0) {
                return false;
            }
        }
        
        return true;
    }
}