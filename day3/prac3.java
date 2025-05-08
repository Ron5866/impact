package day3;
import java.util.Scanner;

public class prac3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int c=sc.nextInt();
        if(c%3==0 && c%5==0){
            System.out.println("HIHELLO");
        }
        else if(c%5==0){
            System.out.println("HELLO");
        }
        else if(c%3==0){
            System.out.println("HI");
        }
        else{
            System.out.println("No issue");
        }
        }
    }
    

