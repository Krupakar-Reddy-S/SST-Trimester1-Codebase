import java.util.Arrays;

public class NobelInteger1 {

    /* 
     * Gievn an Array of distinct elements, Count the No. of Nobel Integers.
     * A Integer is said to be Nobel if for every A[i], the count of elements smaller than A[i] == A[i]
    */

    // TC = O(N), SC = O(1)
    public static int countNobelIntegers(int[] A) {
        Arrays.sort(A);
        int countNobel = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] == i) {
                countNobel++;
            }
        }

        return countNobel;
    }

    public static void main(String[] args) {
        int[] A = {-1, -5, 3, 5, -10, 4 };

        System.out.println("Count of Nobel Integers in Given Array: " + countNobelIntegers(A));
    }
}

