import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the nuber of elements : ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0;i<n;i++){
            a[i] = s.nextInt();
        }
        quick(a,0,n-1);
        System.out.println("The array elements after sorting are : ");
        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void quick(int[] arr,int low,int high){
        if(low<high){
            int j = partition(arr,low,high);
            quick(arr, low, j-1);
            quick(arr,j+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low+1, j = high;
        while(i<=j){
            while(i<=j && arr[i]<=pivot){
                i++;
            }
            while(i<=j && arr[j]>pivot){
                j--;
            }
            if(i<j){
                arr[i] = arr[i]^arr[j];
                arr[j] = arr[i]^arr[j];
                arr[i] = arr[i]^arr[j];
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
}
