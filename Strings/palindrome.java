package Strings;
import java.util.Scanner;

public class palindrome {
    public static boolean checkPalindrome(String s){
        int i = 0; int j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        String s1 = s.toLowerCase();
        boolean check = checkPalindrome(s1);
        if(check){
            System.out.println("Palindrome string");
        } else {
            System.out.println("Not a palindrome string");
        }
    }
}
