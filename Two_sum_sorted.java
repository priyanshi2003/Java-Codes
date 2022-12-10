public class Two_sum_sorted {
    boolean hasTwoSumZero (int[] A) {
        // add your logic here
        for(int i=0;i<A.length;i++){

            for(int j=i+1;j<A.length;j++){
                if(A[i]+A[j]==0){
                    return true;
                }
            }
        }

        return false;
    }
}



