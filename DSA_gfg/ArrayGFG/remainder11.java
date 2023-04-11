package ArrayGFG;

import java.util.Scanner;

public class remainder11 {
    public static void main(String[] args) {
        String x = "1234";
        int out = remainder(x);
        System.out.println(out);
    }

    static int remainder(String x) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        scan.close();
        System.out.println(num);
        int output = num % 11;
        System.out.println(output);
        return output;
    }

}
