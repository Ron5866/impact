package day3;
// Conditonal statements in java
import java.util.Scanner;
public class prac2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int c=sc.nextInt();
        if(c%3==0){
            System.out.println("Numvber is divisble by 3");
        }
        else {
            int r=c%3;
            // always use printf while using %d or any format specifier
            System.out.printf("Not divisible by 3 and remainder is %d",r);
        }


    }
    
}
