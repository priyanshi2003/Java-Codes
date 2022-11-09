import java.util.*;

public class bubble_sort {

    public static void main (String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int j=0;j<n;j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
            System.out.println(arr[j]);
        }


    }
}
