package arrays101;

import java.util.Arrays;

public class SquaresSortedArray {

    public int[] sortedSquares(int[] A) {

        int[] newArray = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            newArray[i] = A[i] * A[i];
        }
        Arrays.sort(newArray);
        return newArray;
    }

}
