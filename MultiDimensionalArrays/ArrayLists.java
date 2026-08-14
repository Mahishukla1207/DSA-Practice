package MultiDimensionalArrays;

import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args)
{
    ArrayList<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    ArrayList<Integer> b = new ArrayList<>();
    b.add(14);
    b.add(21);
    b.add(30);
    
    ArrayList<Integer> c = new ArrayList<>();
    c.add(1);
    c.add(3);
    c.add(6);
    c.add(8);
    ArrayList<ArrayList<Integer>> al= new ArrayList<>();
    al.add(a);
    al.add(b);
    al.add(c);
    // System.out.println(al);

    for(ArrayList<Integer> list : al){
        for(int ele : list){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}}
