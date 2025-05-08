// Write a program to print the first n terms of the series 2^0, 3^0, 2^1, 3^1, 2^2, 3^2, .......n terms.

import java.util.Scanner;
class prac5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      int count=0;
      int num=sc.nextInt();
      num/=2;
      for(int i=0;i<num;i++){
        System.out.print((int)Math.pow(2,i)+" "+(int)Math.pow(3,i)+" ");
        count++;
      }
  }
}
 {
    
}
