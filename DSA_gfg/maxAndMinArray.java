package DSA_gfg;

public class maxAndMinArray {
    public static void main(String[] args) {
        long min, max;
        int arr[] = {1,2,3,4,5,6};
        int len = arr.length;
        maxAndMin(arr, len);

    }

    // Function to return max and min of the array. 
    static long maxAndMin(int arr[], int len){
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < len; i++) {
            if(arr[i] < smallest){
                smallest = arr[i];
            }
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;

    }       
}


class pair {
    long first, second;
    public pair (long first, long second){
        this.first = first;
        this.second = second;
    }
}