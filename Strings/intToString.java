package Strings;
import java.util.Scanner;
public class intToString {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    String s = Integer.toString(n);
    System.out.println(s);

}
}