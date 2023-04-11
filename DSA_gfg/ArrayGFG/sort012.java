package ArrayGFG;

//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&status[]=unsolved&category[]=Arrays&curated[]=1&curated[]=8&sortBy=submissions

import java.util.Arrays;

public class sort012 {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 2, 1, 0, 2 };
        // int n = BaseCase.getArraylen();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
