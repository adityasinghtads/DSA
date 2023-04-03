package DSAJava.Practice;

import java.util.Scanner;

public class practice1 {

    // main function:... 

    public static void main(String[] args) {
        // reverse an array. 
        int arr[] = {1,2,3,4,5,6};
        int index = 2;

        // Taking input from user 

        Scanner scan = new Scanner( System.in);
        System.out.println("Enter ur name: ");
        String name = scan.nextLine();
        System.out.println("Hello" + name + "!");
        printArray(arr);
        reverseFunc(arr, 0, arr.length -1, index) ;
        System.out.println("the reverse array is:");
        printArray(arr);
        scan.close();
    }

    // Main function Ending.... 


    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }

    static void reverseFunc(int arr[], int start, int end, int index){
        int temp;
        while(start<end){
            temp = arr[start]; 
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }
    }

}
