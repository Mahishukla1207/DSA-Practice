package Strings;
public class compareToStringMethod {
    public static int compareTo(String a, String b){
        int minlen = Math.min(a.length(), b.length());
        for(int  i = 0; i < minlen; i++){
            if(a.charAt(i) != b.charAt(i)){
                return a.charAt(i) - b.charAt(i);
            }
        }
        return a.length() - b.length();
    }
    public static void main(String[] args){
        String a = "raghav";
        String b = "preet";
        System.out.println(compareTo(a,b)); // ans = 2,  why? == gives the subtract output of the letters like r ascii - p ascii. Just like that if the letters at first is same then wherever it will find different letter/char it will subtract ascii of chat of first string and 2nd string and return subtracted output

    }
}
