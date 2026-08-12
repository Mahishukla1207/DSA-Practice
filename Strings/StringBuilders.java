package Strings;
// import java.util.ArrayList;
import java.util.Scanner;
public class StringBuilders {
    public static void main(String[] args) {
        // ArrayList<Character> str = new ArrayList<>();
        // str.add('a');
        // System.out.println(str);
        // str.set(0, 'r');
        // System.out.println(str);
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        System.out.println(sb.length() + " " + sb.capacity());
        sb.append("Mahi");
        System.out.println(sb);
        // System.out.println(str);
        sb.setCharAt(1, 'd');
        System.out.println(sb);

    }}

