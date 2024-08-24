import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the nuber of elements : ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0;i<n;i++){
            a[i] = s.nextInt();
        }
        merge(a,0,n-1);
        System.out.println("The array elements after sorting are : ");
        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void merge(int[] arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            merge(arr, low, mid);
            merge(arr, mid+1, high);
            merge_sort(arr,low,mid,high);
        }
    }
    public static void merge_sort(int[] arr,int low,int mid,int high){
        int[] c = new int[high-low+1];
        int i = low,j = mid+1,k = 0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                c[k++] = arr[i++];
            }else{
                c[k++] = arr[j++];
            }
        }
        while(i<=mid){
            c[k++] = arr[i++];
        }
        while(j<=high){
            c[k++] = arr[j++];
        }
        for(int p = 0;p<c.length;p++){
            arr[low+p] = c[p];
        }
    }
}
