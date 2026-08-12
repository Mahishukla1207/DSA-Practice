package MultiDimensionalArrays;
public class ColumnwisePrint {
    public static void main(String[] args){
        int[][] arr = {{2,3,4,5}, {4,8,6,5}, {7,6,9,0}};
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
