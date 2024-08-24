import java.util.*;

class Job{
    char id;
    int deadline;
    int profit;
}
public class jobSequencing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of jobs: ");
        int n = s.nextInt();
        Job[] job = new Job[n];
        int totalProfit = 0;
        for(int i = 0;i<n;i++){
            job[i] = new Job();
            System.out.print("Enter job id,profit and deadline: ");
            job[i].id = s.next().charAt(0);
            job[i].profit = s.nextInt();
            job[i].deadline = s.nextInt();
        }
        Arrays.sort(job,(a,b)->b.profit-a.profit);
        int[] result = new int[n];
        boolean[] slot = new boolean[n];
        for(int i = 0;i<n;i++){
            for(int j = Math.min(n,job[i].deadline)-1;j>=0;j--){
                if(!slot[j]){
                    result[j] = i;
                    slot[j] = true;
                    totalProfit+=job[i].profit;
                    break;
                }
            }
        }
        System.out.println("The sequence of jobs are: ");
        for(int i = 0;i<n;i++){
            if(slot[i]) System.out.print(job[result[i]].id);
        }
        System.out.println("Profit = "+totalProfit);
    }
}
