public class Problem12 {
    public static void main(String[] args) {
        int numTriangle = 1;
        int previousTriangleNumber = 0;
        while(true) {
            int triangleNumber = previousTriangleNumber + numTriangle;
            
            int divisors = 0;
            for(int i=1 ; i <= Math.sqrt(triangleNumber) ; i++) {
                if(triangleNumber % i == 0) {
                    divisors+=2;
                }
            }

            
            if(divisors > 500) {
                System.out.println(triangleNumber);
                return;
            }

            numTriangle++; 
            previousTriangleNumber = triangleNumber;
        }
    }
}