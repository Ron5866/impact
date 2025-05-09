import java.util.*;

public class prac1 {
  public static long reverse(long n){
    long rev=0;
    while(n!=0){
      long rem=n%10;
      rev=rev*10+rem;
      n/=10;
    }
    return rev;
  }
        
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      long num=sc.nextLong();
      long numsq=num*num;
      long rev1=reverse(num);
      long revsqr=rev1*rev1;
      if(numsq==reverse(revsqr)){
        System.out.println("Adam");
      }
      else{
        System.out.println("Not Adam");
      }
    
      
      
      
    }
}