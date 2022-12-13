public class Largest_contiguous_sum {
    //kadane algo
    int largestContiguousSum(int[] arr) {
        int maxx = 0;
        int sum = 0;
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxVal = Math.max(maxVal, arr[i]);
            minVal = Math.min(minVal, arr[i]);
        }
        if (maxVal < 0) {
            return minVal;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxx = Math.max(maxx, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        //Brute force
        // int maxx=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        // 	for(int j=0;j<arr.length;j++){
        // 		int sum=0;
        // 		for(int k=i;k<=j;k++){
        // 			sum+=arr[k];
        // 		}
        // 		maxx=Math.max(maxx,sum);
        // 	}
        // }
        // int[]temp=new int[arr.length];
// 		for(int i=0;i<arr.length;i++){
// 			temp[i]=arr[i];
// 		}
// 		int sum=0;
// 		Arrays.sort(temp);
// 		for(int i=0;i<temp.length;i++){
// 			if(temp[0]>=0){
// 				sum+=arr[i];
// 			}
// 			else{

// 			}
// 		}
        return maxx;
    }
}

