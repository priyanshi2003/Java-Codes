
public class square_sorted {
    int[] getSquareSortedArray (int[] arr) {
        // add your logic here
        int[] square= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            square[i]=arr[i]*arr[i];


        }
        Arrays.sort(square);
        return square;
    }
}
