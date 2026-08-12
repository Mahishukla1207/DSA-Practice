package Strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Devesh";
        StringBuilder sb = new StringBuilder(s);
        // int i = 0;
        // int j = sb.length() - 1;

        // while (i <= j) {
        //     char temp1 = sb.charAt(i);
        //     char temp2 = sb.charAt(j);
        //     sb.setCharAt(i, temp2);
        //     sb.setCharAt(j, temp1);
        //     i++;
        //     j--;
        // }


        // sb.reverse();

        
        sb.deleteCharAt(1); //insert and deleteCharAt are costly process
        sb.insert(1, 'e');
        sb.delete(3, 6); //to delete a substring
        System.out.println(sb);
    }
}
