public class problem3 {
    public static void main(String[] args) {
        long number = 600851475143L;

        for(long i=2 ; i<number ; i++) {
            if(number % i == 0) {
                long quotient = number / i;
                if(isPrime(quotient)) {
                    System.out.println("Largest prime factor: " + quotient);
                    break;
                }
            }
        }
    }

    public static boolean isPrime(long number) {
        for(long i=2 ; i<number ; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true; 
    }
}