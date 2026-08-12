package Strings;
// import java.util.*;
public class SubStringsOfStrings {
    public static void main(String[] args) {
        //ALL SUBSTRINGS OF A FOLLOWING STRING
        String s = "gopi";
        for(int  i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
            System.out.println(s.substring(i,j) + " ");
        }
        System.out.println();
        }

    }}

