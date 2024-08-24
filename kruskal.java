import java.util.*;
public class kruskal {
    static int[] parent = new int[10];
    public static int find(int m){
        int p = m;
        while(parent[p]!=0) p = parent[p];
        return p;
    }
    public static void union(int i,int j){
        if(i<j) parent[i] = j;
        else parent[j] = i;
    }
    public static void krskl(int[][] w,int n){
        int u = 0,v = 0,k = 0,min,sum=0;
        while(k<n-1){
            min = 99;
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=n;j++){
                    if(i!=j && w[i][j]<min){
                        min = w[i][j];
                        u = i;
                        v = j;
                    }
                }
            }
            int root1 = find(u);
            int root2 = find(v);
            if(root1!=root2){
                union(root1,root2);
                sum+=w[u][v];
                System.out.println(u+"->"+v+"="+w[u][v]);
                k++;
            }
            w[u][v] = w[v][u] = 999;
        }
        System.out.println("The cost of min spanning tree is "+sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of vertices: ");
        n = s.nextInt();
        int[][] w = new int[10][10];
        System.out.println("Enter the weighted graph: ");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                w[i][j] = s.nextInt();
            }
        }
        krskl(w, n);
    }
}
