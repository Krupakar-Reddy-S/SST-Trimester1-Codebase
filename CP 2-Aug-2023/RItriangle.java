import java.util.*;

class RItriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to print Triangle with spaces Pattern: ");
        int N = sc.nextInt();
        int i = N;

        while(i >= 0){
            int j = 1;
            while(j < i){
                System.out.print(" ");
                j++;
            }
            while(j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}


