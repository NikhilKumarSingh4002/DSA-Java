import java.util.Scanner;

public class linearSearch {
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
        //System.nanoTime
        if (linearSearch(arr, key)==-1){
            System.out.println("element not found");
        }else{
            System.out.println("Element foud at "+linearSearch(arr, key));
        }
    }
    public static int linearSearch(int[] arr,int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key) return i;
        }
        return -1;
    }
}
