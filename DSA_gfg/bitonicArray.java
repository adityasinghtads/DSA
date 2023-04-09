// https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1?page=1&category[]=Arrays&curated[]=8&sortBy=submissions

package DSA_gfg;

public class bitonicArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,6,5,4,3};
        int n = arr.length;
        int result = maximunInt(arr, n);
        System.out.println(result);
    }

    static int maximunInt(int[] arr, int n){
        int max = arr[0];
        for ( int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
}
