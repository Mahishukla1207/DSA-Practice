package recursion;

import java.util.*;
public class OneToN {
    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n - 1);
        System.out.println(n + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        print(n);
    }
}
