package DSAJava.Arrays;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Hey its me, reading Java.");
        basicArray();
    }

    static void basicArray() {
        char vowels[] = new char[2];
        vowels[0] = 'a';
        vowels[1] = 'b';
        System.out.println(vowels);
        System.out.println(Arrays.toString(vowels));

        // Array of Integer

        int intArr[] = new int[1];
        intArr[0] = 1;
        System.out.println(intArr);
        System.out.println(Arrays.toString(intArr));

        // looping a Array and printing each element.
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(i);
            i++;
        }
        // finding length of array 
        System.out.println(vowels.length);
        // Array of string 
        String[] tads = new String[] {"tads","Aditya"};
        System.out.println(tads);

        for (int i = 0; i < tads.length; i++) {
            System.out.println(Arrays.toString(tads));
        }

    }

}
