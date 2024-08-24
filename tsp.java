import java.util.*;
public class tsp {
    public static void main(String[] args) {
        int n;
        int[][] costMatrix = new int[10][10];
        int[] tour = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of cities: ");
        n = s.nextInt();
        if(n == 1){
            System.out.println("Only one city");
            return;
        }
        for(int i = 1;i<=n;i++){
            tour[i] = i;
        }
        System.out.println("Enter the cost matrix: ");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                costMatrix[i][j] = s.nextInt();
            }
        }
        int cost = tspdp(costMatrix,tour,1,n);
        for(int i = 1;i<=n;i++){
            System.out.println(tour[i]+"->");
        }
        System.out.println("1");
        System.out.println("The cost is "+cost);
    }
    static int tspdp(int[][] c,int[] tour,int start,int n){
        if(start == n-1){
            return c[tour[n-1]][tour[n]]+c[tour[n]][1];
        }
        int[] mintour = new int[10];
        int[] temp = new int[10];
        int mincost = 999;
        for(int i = start+1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                temp[j] = tour[j]; 
            }
            temp[start+1] = tour[i];
            temp[i] = tour[start+1];
            int ccost = tspdp(c, temp, start+1, n);
            if(c[tour[start]][tour[i]]+ccost<mincost){
                mincost = c[tour[start]][tour[i]]+ccost;
                for(int k = 1;k<=n;k++){
                    mintour[k] = temp[k];
                }
            }
        }
        for(int i = 1;i<=n;i++){
            tour[i] = mintour[i];
        }
        return mincost;
    }
}
