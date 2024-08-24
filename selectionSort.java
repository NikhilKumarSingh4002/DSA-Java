import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the nuber of elements : ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0;i<n;i++){
            a[i] = s.nextInt();
        }
        selection(a);
        System.out.println("The array elements after sorting are : ");
        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void selection(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp; 
        }
    }
}
