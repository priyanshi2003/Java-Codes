import java.util.*;
public class quick_sort {
    public static int partition(int arr[],int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void QuickSort(int arr[], int low, int high){
        if(low<high){
            int chng=partition(arr,low,high);
            QuickSort(arr,low,chng-1);
            QuickSort(arr,chng+1,high);
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        QuickSort(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }


    }
}
