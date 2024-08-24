import java.util.Scanner;

public class dijkstra {
    public static int[] distance = new int[10];
    public static int[][] cost = new int[10][10];
    public static void calc(int n,int s){
        boolean[] flag = new boolean[n+1];
        for(int i = 1;i<=n;i++){
            distance[i] = cost[s][i];
        }
        flag[s] = true;
        int c = 1;
        int min,minpos = 1;
        while(c<n){
            min = Integer.MAX_VALUE;
            for(int k = 1;k<=n;k++){
                if(!flag[k] && distance[k]<min){
                    min = distance[k];
                    minpos = k;
                }
            }
            flag[minpos] = true;
            c++;
            for(int k = 1;k<=n;k++){
                if(!flag[k] && distance[minpos]+cost[minpos][k]<distance[k]){
                    distance[k] = distance[minpos]+cost[minpos][k];
                }
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        n = s.nextInt();
        System.out.println("Enter the weighted graph: ");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                cost[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter source vertex: ");
        int sc = s.nextInt();
        calc(n, sc);
        System.out.println("The distance from source is ");
        for(int i = 1;i<=n;i++){
            if(i!=sc){
                System.out.println(sc +"->"+i+"="+distance[i]);
            }
        }
    }
}
