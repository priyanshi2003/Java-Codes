public class matrix_search {
    boolean searchMatrix(int[][] matrix, int key) {
        int rowSize = matrix.length, columnSize = matrix[0].length;
        for (int i = 0; i < rowSize; i++) {
            for ( int j = 0; j < columnSize; j++) {
                if (matrix [i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }
}

