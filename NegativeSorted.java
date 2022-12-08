public class NegativeSorted {
    int getNegativeNumbersCount (int[] arr) {
        // add your logic here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
        }
        return count;
    }
}

