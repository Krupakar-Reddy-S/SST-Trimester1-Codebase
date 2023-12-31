import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] A) {

        // TC = O(N^2), SC = O(1)
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length - i -1; j++) {
                if(A[j] > A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int A[] = {-1, -5, 3, 5, -10, 4 };
        bubbleSort(A);

        System.out.println(Arrays.toString(A));
    }
}
