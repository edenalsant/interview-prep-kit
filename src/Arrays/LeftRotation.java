package Arrays;

/*
    Solution for problem shorturl.at/egmU3

*/
public class LeftRotation {

    static int[] fixIndex(int d, int length) {
        d = d % length;

        int indeces[] = new int[length];
        int position;

        for (int i = 0; i < length; i++) {
            position = i + d;

            if (position < 0) {
                indeces[i] = position + length;
            } else if (position >= length) {
                position = position - length;
            }

            indeces[i] = position;
        }

        return indeces;
    }

    static int[] buildArray(int[] a, int[] indices) {
        int finalArray[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            finalArray[i] = a[indices[i]];
        }

        return finalArray;
    }

    static int[] rotLeft(int[] a, int d) {
        int indeces[] = fixIndex(d, a.length);

        return buildArray(a, indeces);

    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4};
        int d = 100;
        arr = rotLeft(arr, d);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
