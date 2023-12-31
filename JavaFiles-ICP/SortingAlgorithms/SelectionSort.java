import java.util.Arrays;

public class SelectionSort {

    /* 
     * Selection Sort:
     * 
     * Working: Selection sort repeatedly selects the minimum (or maximum) element from the unsorted portion of the Array 
     *          and places it at the beginning of the sorted portion.
     * 
     * Stability: Selection sort is not stable.
     * 
     * Time Complexity(Best): O(n^2) - Same as the worst case.
     * 
     * Time Complexity(Worst): O(n^2) - This is the worst-case scenario.
     * 
     * Space Complexity: O(1) - Selection sort sorts the Array in-place.
     * 
     * Unique Feature: Selection sort repeatedly selects the minimum element and places it at the beginning of the 
     *                 unsorted portion of the Array.
     * 
    */
    
    public static void swap(int[] A, int first, int second) {
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

    public static int getMaxIndex(int[] A, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if(A[i] > A[max]){
                max = i;
            }
        }

        return max;
    }

    public static void selectionSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int last = A.length -1 - i;
            int maxIndex = getMaxIndex(A, 0, last);

            swap(A, maxIndex, last);
        }
    }

    public static void main(String[] args) {
        int[] A = {23, 12, 1, 5, 6, 9, 13, 19, 7 };
        System.out.println("Original Array: " + Arrays.toString(A));

        selectionSort(A);

        System.out.println("Array After Selection Sort: " + Arrays.toString(A));
    }
}
