public class Problem9 {
    public static void main(String[] args) {
        for(long i=1 ; i<1000 ; i++) {
            for(long j=1 ; j<1000 ; j++) {
                for(long k=1 ; k<1000 ; k++) {
                    long sum = i + j + k;
                    if(sum == 1000L) {
                        if(isPythagoreanTriple(i, j, k)) {
                            System.out.println(i);
                            System.out.println(j);
                            System.out.println(k);
                            System.out.println(i*j*k);
                            return;
                        }
                    }
                }
            }
        }
    }

    public static boolean isPythagoreanTriple(long i, long j, long k) {
        if((i*i) + (j*j) == (k*k)) {
            return true;
        }
        return false;
    }
}