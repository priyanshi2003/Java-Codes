public class Identical_Twins {

        int getIdenticalTwinsCount (int[] arr) {
            // add your logic here
            int count=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
            }
            return count;
        }
    }

