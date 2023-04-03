package DSAJava.Arrays;

import java.util.Scanner;

public class reverseArray {

    static void reverse(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            // System.out.println();
        }
    }


    static void takingEntry(int array[]){
        Scanner scanLength = new Scanner(System.in);
        int arrayLength =0;
        arrayLength = scanLength.nextInt();
        int[] arrayNumber = new int[arrayLength];
        Scanner scanArray = new Scanner(System.in);
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = scanArray.nextInt();
        }
        System.out.println(arrayLength);
        System.out.println(arrayNumber);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        printArray(arr, arr.length);
        //Scanner scan = new Scanner(System.in);
        //int newArr[] = new int[]
        reverse(arr, 0, arr.length - 1);
        System.out.println("Reversed Array is : ");
        printArray(arr, arr.length);

    }
}
