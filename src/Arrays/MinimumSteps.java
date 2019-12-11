package Arrays;

public class MinimumSteps {
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

    static int countSwaps(int[] a){
        normalizeArray(a);
        boolean visited[] = new boolean[a.length];
        boolean endCycle = false;

        int cycleSize = 0;
        int nextNode = 0;
        int swaps = 0;

        for (int i = 0; i < a.length; i++) {
            if (!visited[i]) {
                nextNode = i;
                while (!endCycle) {
                    if (!visited[nextNode]) {
                        cycleSize++;
                        visited[nextNode] = true;
                        nextNode = a[nextNode];

                    } else {
                        endCycle = true;
                    }
                }
                endCycle = false;
                swaps += cycleSize - 1;
                cycleSize = 0;
            }
        }

        return swaps;
    }


    public static void main(String[] args) {
        int a[] = new int[10];
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
