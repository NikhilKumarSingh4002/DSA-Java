import java.util.*;

public class coinChange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of denomiantions: ");
        int n = s.nextInt();
        int[] c = new int[n];
        int[] coins = new int[n];
        System.out.println("Enter coins : ");
        for(int i = 0;i<n;i++){
            c[i] = s.nextInt();
        }
        System.out.println("Enter total value of coin:");
        int a = s.nextInt();
        for(int i = 0;i<c.length;i++){
            coins[i] = a/c[i];
            a = a % c[i];
        }
        int no = 0;
        for(int i = 0;i<n;i++){
            no+=coins[i];
            System.out.println(coins[i]+" ");
        }
    }

}
