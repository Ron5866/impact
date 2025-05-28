import java.util.*;

public class PrimeFactors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its prime factors:");
        int n = sc.nextInt();
        System.out.print("Prime factors of " + n + " are: ");
        for (int i = 2; i <=n/2; i++) {
            if(n % i ==0 && isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int i){
        for(int itr=2;itr<=i/2;itr++){
            if(i%itr==0){
                return false;
            }
        }
        return true;
    }
}
