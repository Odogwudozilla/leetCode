package arrays101;

import java.util.Arrays;

public class DuplicateZeros {
    /**
    Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

    Note that elements beyond the length of the original array are not written.

    Do the above modifications to the input array in place, do not return anything from your function.

    Example 1:

    Input: [1,0,2,3,0,4,5,0]
    Output: null
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
    Example 2:

    Input: [1,2,3]
    Output: null
    Explanation: After calling your function, the input array is modified to: [1,2,3]
    */
        static int[] arr1 = {1,0,2,3,0,4,5,0};

    public void duplicateZeros(int[] arr) {

        for(int i=(arr.length-1); 1>=0; i--){
            System.out.println("This is the value of i: " + arr[i]);
            if(arr[i] == 0 && i == arr.length-1) {
                continue;
            }
            if(arr[i] == 0) {
                System.out.println(arr[i]);
                arr[i+1] = 0;
                System.out.println(Arrays.toString(arr));
            }
        }

    }

    public static void main(String[] args) {
        DuplicateZeros dz = new DuplicateZeros();

        dz.duplicateZeros(arr1);
    }
}
