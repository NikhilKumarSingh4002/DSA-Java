import java.util.*;
public class prim {
    public static void main(String[] args) {
        int n,k,min,u=0,v=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        n = sc.nextInt();
        int[] s = new int[10];
        Arrays.fill(s,0);
        int[][] w = new int[10][10];
        System.out.println("Enter the weighted matrix: ");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                w[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("Enter the source vertex: ");
        int source = sc.nextInt();
        s[source] = 1;
        k = 1;
        int cost = 0;
        while(k<=n-1){
            min = 99;
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=n;j++){
                    if(s[i]==1 && s[j]==0){
                        if(i!=j && min>w[i][j]){
                            min = w[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }
            s[v] = 1;
            cost+=min;
            k++;
            System.out.println(u+"->"+v+"="+min);
        }
        System.out.println("Total cost is "+cost);
        for(int i = 1;i<=n;i++){
            if(s[i]==0){
                System.out.println("No spanning tree");
                break; 
            }
        }
    }
}
