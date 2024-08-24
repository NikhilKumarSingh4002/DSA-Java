import java.util.*;
public class sumOfSubset {
    static int c = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements: ");
        n = s.nextInt();
        int[] w = new int[10];
        int[] x = new int[10];
        System.out.println("Enter the elements in increasing order: ");
        for(int i = 0;i<n;i++){
            w[i] = s.nextInt();
        }
        System.out.println("Enter d: ");
        int d = s.nextInt();
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=w[i];
        }
        if(sum<d || w[0]>d){
            System.out.println("subset not possible");
            System.exit(0);
        }
        finalsubset(0,0,sum,x,w,d);
        if(c == 0){
            System.out.println("Subset not possible");
        }
    }
    static void finalsubset(int cs,int k,int r,int[] x,int[] w,int d){
        x[k] = 1;
        if(cs+w[k] == d){
            c++;
            System.out.println("The solution is ");
            for(int i = 0;i<=k;i++){
                if(x[i] == 1){
                    System.out.print(w[i]+" ");
                }
            }
        }else if (cs+w[k]+w[k+1]<=d){
            finalsubset(cs+w[k], k+1, r-w[k], x, w, d);
        }
        if((cs+r-w[k])>=d && (cs+w[k+1])<=d){
            x[k] = 0;
            finalsubset(cs, k+1, r-w[k], x, w, d);
        }
    }
}
