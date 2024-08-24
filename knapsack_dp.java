import java.util.*;
public class knapsack_dp {
    int n;
    int c;
    int[] w;
    int[] p;
    int[][] v;
    knapsack_dp(int n,int c,int[] w,int[] p){
        this.n = n;
        this.c = c;
        this.w = w;
        this.p = p;
        this.v = new int[n+1][c+1];
    }
    void compute(){
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=c;j++){
                if(i == 0 || j == 0){
                    v[i][j] = 0;
                }else{ 
                    if(i == 0 || j == 0) v[i][j] = 0;
                    else if (j-w[i]>=0){
                        v[i][j] = Math.max(v[i-1][j],v[i-1][j-w[i]]+p[i]);
                    }else if(j-w[i]<0){
                        v[i][j] = v[i-1][j];
                    }
                }
            }
        }
        System.out.println("Optimal solution is "+ v[n][c]);
        traceback();
    }
    void traceback(){
        int i = n;
        int j = c;
        while(i>0){
            if(v[i][j]!=v[i-1][j]){
                System.out.println(i+" ");
                j = j-w[i];
                i--;
            }else{
                i--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of objects: ");
        n = s.nextInt();
        System.out.println("Enter the capacity of knapsack: ");
        int c = s.nextInt();
        System.out.println("Enter the weights");
        int[] w = new int[n+1];
        for(int i = 1;i<=n;i++){
            w[i] = s.nextInt();
        }
        System.out.println("Enter profits");
        int[] p = new int[n+1];
        for(int i = 1;i<=n;i++){
            p[i] = s.nextInt();
        }
        knapsack_dp gk = new knapsack_dp(n, c, w, p);
        gk.compute(); 
    }
}
