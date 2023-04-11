package ArrayGFG;

import java.util.Arrays;

public class waveArray {
    public static void main(String[] args) {
        // This is wave an aray which is sorted asending..
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int n = 6;
        int[] result = waveArr(a, n);
        // System.out.println(result);
        System.out.println(Arrays.toString(result));
        // System.out.println(result);

    }

    static int[] waveArr(int a[], int n) {
        for (int i = 1; i < n; i = i + 2) {
            a[i] = a[i] + a[i - 1];
            a[i - 1] = a[i] - a[i - 1];
            a[i] = a[i] - a[i - 1];
        }
        return a;
    }

}
