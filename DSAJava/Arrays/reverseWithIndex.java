package DSAJava.Arrays;

import java.util.Scanner;

public class reverseWithIndex {

    // taking input functio
    public static int[] takingInput(int arr) {
        int[] newArr = new int[arr];
        Scanner scanner = new Scanner(System.in);
        // taking input for array
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = scanner.nextInt();
            i++;
        }
        scanner.close();
        return newArr;
    }

    public static void reverseFunc(int[] arr, int len, int start){
        int temp;
        while(start < len ){
            temp = arr[start];
            arr[start] = arr[len];
            arr[len] = temp;
            start++;
            len --;
        }
    }

    static void printingFunc(int arr, int arrlen){
        for (int i = 0; i < arrlen; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLen = scanner.nextInt();
        scanner.close();
        // taking input from user, Array length and array.
        int[] arr = takingInput(arrayLen);
        reverseFunc(arr, arrayLen, 0);
    }
}
