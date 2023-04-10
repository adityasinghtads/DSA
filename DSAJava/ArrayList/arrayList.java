package DSAJava.ArrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // Array List in Java
        // Dynamic way of storing Elements , No fixed size.
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        for (int i = 0; i < 4; i++) {
            al.add(i);
        }
        System.out.println(al);

        int wipro = al.get(0);
        System.out.println(wipro);
        al.set(0, 2);
        wipro = al.get(0);
        System.out.println(wipro);

        al.remove(0);
        wipro = al.get(0);
        System.out.println(wipro);

       // al.clear();
        System.out.println(al);

        // Looping through an arraylist. 
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // Using For each loop 

    for (Integer integer : al) {
        System.out.println(integer);
    }

    }
}
