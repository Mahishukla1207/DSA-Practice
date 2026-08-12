package Strings;

public class InteringNew {
    public static void main(String[] args){
        // String s = "Bishal";
        // s = s.substring(0,3) + "m" + s.substring(4);
        // System.out.println(s);

        String s1 = new String("Mahi");
        String s2 = new String("Mahi");
        System.out.println(s1 == s2); //will give false as s1 and s2 ki locations compare hogi, not actual value
        System.out.println(s1.equals(s2)); //will return true as it compares string as char by char
        
    }
}
