//https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&status[]=unsolved&category[]=Arrays&curated[]=1&curated[]=8&sortBy=submissions

package ArrayGFG;

import java.util.Arrays;

public class arrayEqual {
    public static void main(String[] args) {
        int arr[] = BaseCase.getArray();
        int arr1[] = { 1, 2, 3, 4 };

        // int len = BaseCase.getArraylen();
        // int len1 = BaseCase.getArraylen();

        boolean result = equArr(arr, arr1);
        System.out.println(result);
    }

    static boolean equArr(int arr[], int arr1[]) {
        // boolean res = true;
        if (arr.length != arr1.length) {
            return false;

        }
        Arrays.sort(arr);
        Arrays.sort(arr1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                return false;
            }
        }
        return true;

    }
}
