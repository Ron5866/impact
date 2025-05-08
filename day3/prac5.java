package day3;
import java.util.Scanner;
public class prac5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day,month,year:");
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        if(year%4==0 &&year%100!=0 || year%400==0){
            System.out.println("It is leap year ");
        }
        else{
            System.out.println("It is not a leap year");
        }

    }
    
}
