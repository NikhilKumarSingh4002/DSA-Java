import java.util.*;
public class hamiltonian {
    static int[] x = new int[25];
    static void next_vertex(int[][] G,int n,int k){
        int j;
        while(true){
            x[k] = (x[k]+1)%(n+1);
            if(x[k] == 0) 
                return;
            if(G[x[k-1]][x[k]]!=0){
                for(j = 1;j<=k-1;j++){
                    if(x[j] == x[k])
                        break;
                }
                if(j == k){
                    if((k<n)||((k == n) && (G[x[k]][x[1]]!=0))){
                        return;
                    }
                }
            }
        }

    }
    static void H_Cycle(int[][] G,int n,int k){
        while(true){
            next_vertex(G, n, k);
            if(x[k] == 0){
                return;
            }
            if(k == n){
                for(int i= 1;i<=k;i++){
                    System.out.print(x[i]+"->");
                }
                System.out.println();
            }else{
                H_Cycle(G, n, k+1);
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        n = s.nextInt();
        int[][] G = new int[25][25];
        System.out.println("Enter the path adjacency matrix: ");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                G[i][j] = s.nextInt();
                x[i] = 0;
            }
        }
        x[1] = 1;
        H_Cycle(G, n, 2);
    }
}
