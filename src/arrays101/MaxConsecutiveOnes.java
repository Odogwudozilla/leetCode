package arrays101;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int theNumberOfDigits = 0;
        int maxNumberOfDigits = 0;

        for (int i = 0; i < nums.length; i++) {
            //System.out.println("Checking " + nums[i] + " at index " + i);

            if (nums[i] == 1) {
                theNumberOfDigits++;

            } else {
                if (maxNumberOfDigits < theNumberOfDigits) {
                    maxNumberOfDigits = theNumberOfDigits;
                }
                System.out.println("Counter reset");
                theNumberOfDigits = 0;
            }
        }
        System.out.println("The max number of consecutive digits is: " + maxNumberOfDigits);
        return Math.max(maxNumberOfDigits, theNumberOfDigits);
    }


}
