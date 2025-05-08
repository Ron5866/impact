// Write a program to find the sum of digits of a number using while loop.
//other way,is by using the multiples of 9 
import java.util.Scanner;
class prac2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int sum=0;
    while (num!=0){
      int r=num%10;
      num=num/10;
      sum +=r;
    }
    
    System.out.println(sum);
  }
}