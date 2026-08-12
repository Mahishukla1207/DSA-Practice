package MultiDimensionalArrays;
public class OutputIn2DArray {
    public static void main(String[] args) {
        // int[][] arr = new int[3][4];
        int[][] arr = {{2,3,4,5}, {4,8,6,5}, {7,6,9,0}};
        System.out.println(arr.length); //will give no of rows
        System.out.println(arr[0].length); // will give number of columns

         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
