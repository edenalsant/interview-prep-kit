package Arrays;

import java.util.Scanner;

public class ArrayManipulation {

    static long maxValue(int[] arr){
        long max = arr[0];
        long curr = arr[0];

        for (int i = 1; i < arr.length; i++){
          curr += arr[i];

          if (curr > max) {
              max = curr;
          }
        }

        return max;
    }

    static long arrayManiputalion(int n, int[][] queries) {
        int arr[] = new int[n];
        int initialPos = 0;
        int finalPos = 0;
        int value = 0;

        for(int i = 0; i < queries.length; i++) {
            initialPos = queries[i][0] - 1;
            finalPos = queries[i][1] - 1;
            value = queries[i][2];

            arr[initialPos] += value;

            if(finalPos == n - 1) {
                continue;
            } else {
                arr[finalPos+1] -= value;
            }
        }

        return maxValue(arr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries[][] = new int[4][3];
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                queries[i][j] = in.nextInt();
            }
        }
        System.out.println(arrayManiputalion(10, queries));
    }
}
