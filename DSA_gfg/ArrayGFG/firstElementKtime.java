package ArrayGFG;

import java.util.HashMap;

public class firstElementKtime {
    public static void main(String[] args) {
        int a[] = BaseCase.getArray();
        int n = BaseCase.getArraylen();
        int k = 2; // Nmber of times the vaues repeeats in array. 
        firstElementtime(a, n, k);
    }    

    static void firstElementtime(int[] a, int n, int k ){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(!map.containsKey(a[i])){
                map.put(a[i], 1);
            }
        }
    }
}
