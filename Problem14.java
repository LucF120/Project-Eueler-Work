
public class Problem14 {
    public static void main(String[] args) {
        long longestChain = 10L;
        long largestStartingNum = 13L;
        long[] allValues = new long[1000000];
        long allValuesLength = 13L;

        for(int i=14 ; i<1000000 ; i++) {
            System.out.println("INDEX: " + i);
            long value = i;
            long sequenceSize = 1L;
            while(value != 1) {
                if(value <= allValuesLength) {
                    int valueIndex = (int) value;
                    sequenceSize = sequenceSize + allValues[valueIndex];
                    break;
                }
                sequenceSize++;
                if(value % 2 == 0) {
                    value = value / 2;
                } else {
                    value = value * 3L + 1L;
                }
            }
            if(sequenceSize > longestChain) {
                longestChain = sequenceSize;
                largestStartingNum = i;
            }
            allValues[i] = sequenceSize;
            allValuesLength++;
        }

        System.out.println(largestStartingNum);
    }
}