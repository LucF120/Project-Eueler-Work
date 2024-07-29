public class Problem5 {
    public static void main(String[] args) {
        int counter = 2520;
        boolean done = false;
        while (!done) {
            System.out.println("Current counter: " + counter);
            int numTrue = 0;
            for(int i=11 ; i<=20 ; i++) {
                if(counter % i == 0) {
                    numTrue++;
                }
            }
            if(numTrue == 10) {
                System.out.println(counter);
                done = true;
                return;
            } else {
                counter+= 2520;
            }
        }
    }

    //This finds the smallest number divisible by 1-10 without a remainder
    // public static void main(String[] args) {
    //     int counter = 10;
    //     boolean done = false;
    //     while(!done) {
    //         System.out.println("Current counter: " + counter);
    //         int numTrue = 0;
    //         for(int i=6 ; i<=10 ; i++) {
    //             if(counter % i == 0) {
    //                 numTrue++;
    //             }
    //         }
    //         if(numTrue == 5) {
    //             System.out.println(counter);
    //             done = true;
    //             return;
    //         } else {
    //             counter += 10;
    //         }
    //     }
    // }
}