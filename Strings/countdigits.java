package Strings;
import java.util.*;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int count = 0;
        // while(n != 0){
        //     n /= 10;
        //     count++;
        // }
        // System.out.println(count);

        String s = Integer.toString(n);
        System.out.println("Number of digits are : " + s.length());


    }}

