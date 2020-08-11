package arrays101;

public class EvenNumberOfDigits {

    class Solution {
        public int findNumbers(int[] nums) {
            int evenNum = 0;

            for (int i : nums) {
                // System.out.println("Checking " + i);
                int numCount = 0;
                int iSplit = i;
                while( iSplit != 0){
                    iSplit /= 10;
                    ++numCount;
                }

                if(numCount % 2 == 0) {
                    System.out.println("The number " + i + " contains an even number of digits");
                    evenNum++;
                }
            }
            return evenNum;
        }
    }
}
