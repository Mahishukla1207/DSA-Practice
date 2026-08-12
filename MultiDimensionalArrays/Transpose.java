package MultiDimensionalArrays;

public class Transpose {
    
        //To calculate transpose of a matrix
        // works only if the matrix is square

        // for(int  i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[0].length; j++){
        //         if(i != j){
        //          int temp = arr[i][j];
        //             arr[i][j] = arr[j][i];
        //             arr[j][i] = temp;   
        //         }
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //For rectangular matrix

       
    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                result[j][i] = matrix[i][j];

            }
        }

        return result;
    }

public static void main(String[] args){
        int[][] arr = {{2,8,3,4}, {7,2,1,6}, {5,5,4,1}, {3,1,8,2}};
        Transpose transposeObj = new Transpose();
        int[][] result = transposeObj.transpose(arr);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
