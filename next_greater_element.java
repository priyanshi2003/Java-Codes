public class next_greater_element {
    int search(int[]arr, int low, int high , int key){
        if(low<high){
            int mid=(high+low)/2;
            if(arr[mid]<=key){
                return search(arr, mid+1, high,key);

            }
            else{
                return search(arr, low, mid,key);
            }
        }
        else{
            return arr[low];
        }
    }
    int getNextGreaterElement (int[] arr, int key) {
        // add your logic here
        // int res=0;
        // for(int i=arr.length-1;i>=0;i--){
        // 	if(key>=arr[arr.length-1]){
        // 		return key;
        // 	}
        // 	else if(arr[i]>key){
        // 		 res =arr[i-1];
        // 		break;
        // 	}
        // }
        // return res;
        //Optimised Approach

        int n = arr.length;
        if(arr[n-1]<=key){
            return key;
        }
        return search(arr,0,n-1,key);
    }
}

