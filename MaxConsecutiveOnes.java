public class MaxConsecutiveOnes {

        int getMaxConsecutiveOnes(int[] A) {
            // add your logic here
            int count=0;
            int maximum=0;
            for(int i=0;i<A.length;i++){

                if(A[i]==1){
                    count++;
                }
                else{
                    count=0;
                }
                maximum=Math.max(maximum, count);

            }
            return maximum;
        }
    };

