import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number upto which fibo you want: ");
        int n = s.nextInt();
        for(int i: fibo(n)){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int[] fibo(int n){
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2;i<=n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib;
    }
}
