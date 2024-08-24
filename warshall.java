import java.util.Scanner;

public class warshall {
    public static int[][] wrshl(int[][] w,int n){
        for(int k = 1;k<=n;k++){
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=n;j++){
                    w[i][j] = w[i][j] | (w[i][k] & w[k][j]);
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
        w = wrshl(w,n);
        System.out.println("The transitive closure is : ");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(w[i][j]+" ");
            }
            System.out.println();
        }
    }
}
