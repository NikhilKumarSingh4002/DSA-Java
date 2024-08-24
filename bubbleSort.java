import java.util.*;
public class bubbleSort{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the nuber of elements : ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0;i<n;i++){
            a[i] = s.nextInt();
        }
        bubble(a);
        System.out.println("The array elements after sorting are : ");
        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void bubble(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
    }
}