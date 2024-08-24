import java.util.Scanner;

public class minMax {
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the nuber of elements : ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0;i<n;i++){
            a[i] = s.nextInt();
        }
        minmax(a,0,n-1);
        System.out.println("The min and max are : ");
        System.out.print(min+" "+max);
        System.out.println();
    }
    public static void minmax(int[] arr,int low,int high){
        int mid = (low+high)/2;
        if(low == high){
            min = max = arr[low];
        }else if (low == high-1){
            if(arr[low]<arr[high]){
                min = arr[low];
                max = arr[high];
            }else{
                min = arr[high];
                max = arr[low];
            }
        }else{
            minmax(arr, low, mid);
            int min1 = min,max1 = max;
            minmax(arr,mid+1,high);
            if(max<max1) max = max1;
            if(min>min1) min = min1;
        }
    }
}
