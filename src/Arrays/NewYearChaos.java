package Arrays;

import java.util.Scanner;

public class NewYearChaos {

    static void normalizeArray(int[] a){
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            a[i] -= min;
        }
    }

    static void minimumBribes(int[] q){
        normalizeArray(q);
        int totalBribes = 0;
        int currentBribe = 0;

        boolean isChaotic = false;

        for(int i = 0; i < q.length; i++) {
            currentBribe = q[i] - i;
            if (currentBribe > 0 && currentBribe <= 2) {
                totalBribes += currentBribe;
            } else if (currentBribe > 2) {
                isChaotic = true;
                break;
            }

            currentBribe = 0;
        }

        if (isChaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(totalBribes);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int q[] = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }

        normalizeArray(q);
        minimumBribes(q);
    }
}
