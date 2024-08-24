import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        System.out.println("The factorial is "+fact(n));
    }
    public static int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
}
