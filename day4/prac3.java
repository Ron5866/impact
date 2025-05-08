//types oflooping
// entry control/check and exit control/check loop

// Write a program to check whether a number is a power of 2 or not using loop.
import java.util.Scanner;
class prac3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println("Enter the number:");
    int count=num/2;
    if(num%2!=0){
      System.out.println("NO");
    }
    else{
      while(num%2==0){
      num/=2;
    }
    if(num==1){
        System.out.println("YES");
      }
    else{
      System.out.println("NO");
    }  
    }
    }
  }

