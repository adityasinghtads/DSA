// https://practice.geeksforgeeks.org/problems/coin-change2448/1?page=1&category[]=Arrays&curated[]=8&sortBy=submissions

package DSA_gfg;

public class coinArray {
    public static void main(String[] args) {
        int arr[] = BaseCase.getArray();
        int arrSize = BaseCase.getArraylen();
        int sum = 4;
        int noOfWays = count(arr, arrSize, sum);
        System.out.println(noOfWays);
    }

    static int count(int arr[], int arrSize, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j <= sum; j++) {
                dp[j] += dp[j - arr[i]];
            }
        }
        return dp[sum];
    }
}
