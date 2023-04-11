//https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&status[]=unsolved&category[]=Arrays&curated[]=1&curated[]=8&sortBy=submissions

package ArrayGFG;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = BaseCase.getArray();
        int n = BaseCase.getArraylen();
        int k = 3; // the value in the array to search 
        int index = binSearch(arr, n, k);
        System.out.println(index);

    }

    static int binSearch(int arr[], int n, int k){
        int rest =-1 ;
        for(int i=0; i<n; i++){
            if(arr[i] == k){
                rest =i;
            }
        }
        return rest;
    }
}
