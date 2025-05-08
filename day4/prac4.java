//finding the min,max,su,avg without using array

import java.util.Scanner;
class prac4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int min=num,max=num,sum=0,count=0;
      while(num !=-1){
        if(num<min){
          min=num;
        }
        if(num>max){
          max=num;
        }
        sum+=num;
        count++;
        num=sc.nextInt();
      }
      double avg=sum/count;
      System.out.println(min);
      System.out.println(max);
      System.out.println(sum);
      System.out.println(avg);
  }
}
