public class rocolumnzero {
    void rowzero(int[][]matrix, int index, int r){
        for(int i=0;i<r;i++){
            matrix[index][i]=0;
        }
    }
    void columnzero(int[][]matrix, int index, int c){
        for(int i=0;i<c;i++){
            matrix[i][index]=0;
        }
    }
    void setRowColumnZeroes(int[][] matrix){
        int r=matrix.length;
        int c= matrix[0].length;
        boolean toprowZero=false, leftColZero=false;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    if(i==0&&j==0){
                        toprowZero=true;
                        leftColZero=true;
                    }
                    else if(j==0){
                        leftColZero=true;
                        matrix[i][0]=0;
                    }
                    else if(i==0){
                        toprowZero=true;
                        matrix[0][j]=0;
                    }
                    else{
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                    }
                }
            }
        }
        for (int i = 1; i < c; i++) {
            if(matrix[0][i] == 0) {
                columnzero(matrix, i, r);
            }
        }
        for(int i = 1; i < r; i++) {
            if(matrix[i][0] == 0) {
                rowzero(matrix, i, c);
            }
        }
        if(toprowZero == true) {
            rowzero(matrix, 0, c);
        }
        if(leftColZero == true) {
            columnzero(matrix, 0, r);
        }

    }
}

