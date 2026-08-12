package Strings;

public class plusoperator {
    public static void main(String[] args)
{
    String s = "bhakti";
    // s = s + " hi shakti hai";
    s = s + 2; //will convert 2 as string, it will return bhakti2
    s += "\n";
    s += 3;
    System.out.println(s);

    System.out.println("mahi" + 10 + 20); //hum left to right chlte hai, o/p = mahi1020
    System.out.println(10 + "mahi" + 20); // o/p = 10mahi20
}}
