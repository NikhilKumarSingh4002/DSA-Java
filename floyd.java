import java.util.*;
public class floyd {
    public static int[][] flyd(int[][] w,int n){
        for(int k = 1;k<=n;k++){
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=n;j++){
                    w[i][j] = Math.min(w[i][j],w[i][k]+w[k][j]);
                }
            }
        }
        return w;
    }
    public static void main(String[] args) {
        int[][] w = new int[10][10];
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of vertices: ");
        n = s.nextInt();
        System.out.println("Enter the weighted graph: ");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                w[i][j] = s.nextInt();
            }
        }
        w = flyd(w,n);
        System.out.println("The all pair shortest path is : ");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(w[i][j]+" ");
            }
            System.out.println();
        }
    }
}
