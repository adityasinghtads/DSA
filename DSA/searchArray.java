package DSA;

public class searchArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int N = arr.length;
        System.out.println(N);
        int element =  3;
        int a =  search(arr, N, element);
        System.out.println(a);
    }

    static int search(int arr[], int N, int element){
        int temp = -1;
        System.out.println(element);
        for (int i = 0; i < N; i++) {
            if (arr[i] == element){
                temp = i;
                break;
            } else{
                i++;
            }
        }
        return temp;
    }

}
