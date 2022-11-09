import java.util.*;
public class selection_sort {
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++){
            int min=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<n ;i++){
            System.out.println(arr[i]);
        }
    }
}
