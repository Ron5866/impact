package day3;
import java.util.Scanner;
public class prac4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time:");
        int h=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        if(h>=0 && h<24 && m>=0 && m<60 && s>=0 && s<60){
            System.out.println("Valid time "+h+":"+m+":"+s);
        }
        else if(h<0 || h>24 || m<0 || m>60 || s<0 || s>60){
            System.out.println("Invalid time");
        }
        else{
            System.out.println("Invalid time");
        }
    }
}
