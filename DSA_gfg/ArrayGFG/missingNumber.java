package ArrayGFG;

public class missingNumber {
    public static void main(String[] args) {
        int answer = 0;
        int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
        int n = 8;
        answer = missingNum(arr, n);
        System.out.println(answer);
    }

    static int missingNum(int array[], int n) {
        int sum = 0;
        sum = (n * (n + 1)) / 2;
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        int result = 0;
        result = sum - total;
        return result;
    }
}
