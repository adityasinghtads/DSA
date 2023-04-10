//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1?page=1&difficulty[]=-1&difficulty[]=0&difficulty[]=1&status[]=unsolved&category[]=Arrays&curated[]=7&sortBy=submissions

package DSA_gfg;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int arr[] = BaseCase.getArray();
        int n = BaseCase.getArraylen();

        System.out.println(Arrays.toString(arr));

        // Rotate Array by One.
        // Cyclic rotate
        int temp = arr[n - 1], i;
        for (i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
