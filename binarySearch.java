import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter key : ");
        int key = s.nextInt();
        if (binarySearch(arr, key)==-1){
            System.out.println("element not found");
        }else{
            System.out.println("Element foud at "+binarySearch(arr, key));
        }
    }
    public static int binarySearch(int[] arr,int key){
        int low = 0,high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == key) return mid;
            else if (arr[mid]<key) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}
