import java.util.*;
public class matrix_rotation {
    int[][]rotateMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] res = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[j][i] = matrix[i][j];

            }
        }
        for(int i=0;i<col;i++){
            int start=0, end=row-1;
            while(start<end){
                int temp=res[i][start];
                res[i][start]=res[i][end];
                res[i][end]=temp;
                start++;
                end--;
            }
        }
        return res;
    }
    }


