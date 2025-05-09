import java.util.Scanner;
class prac3{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the number");
    long n=sc.nextLong();
    System.out.println("Enter the target:");
    int tar=sc.nextInt();
    int count=0;
    while(n!=0){
      int r=(int)(n%10);
      if(tar==r){
        count++;
      }
      n/=10;
    }
    System.out.println(count);
  }
}