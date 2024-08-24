import java.util.Scanner;

class napsack{
    int n;
    double c,w[],p[];
    napsack(int n,double c,double w[],double p[]){
        super();
        this.n = n;
        this.c = c;
        this.w = w;
        this.p = p;
    }
    void compute(){
        double[] x = new double[n+1];
        double rc = c;
        int i;
        for(i = 0;i<n;i++){
            if(w[i]>rc){
                break;
            }
            x[i] = 1;
            rc = rc-w[i];
        }
        if(i<n){
            x[i] = rc/w[i];
        }
        double profit = 0.0;
        for(i = 0;i<n;i++){
            profit+=x[i]*p[i];
        }
        System.out.println("profit is "+profit);
    }
}
public class knapsack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int n = s.nextInt();
        System.out.println("Enter the profits of objects in order: ");
        double[] p = new double[n];
        double[] w = new double[n];
        for(int i = 0;i<n;i++){
            p[i] = s.nextDouble();
        }
        System.out.println("Enter the weights of objects in order: ");
        for(int i = 0;i<n;i++){
            w[i] = s.nextDouble();
        }
        System.out.println("Enter the capacity of the bag: ");
        int c = s.nextInt();
        napsack np = new napsack(n, c, w, p);
        np.compute();
    }
}
