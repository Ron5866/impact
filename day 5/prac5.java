// 12345/1=12345%10=5
// 12345/10=1234%10=4
// 12345/100=123%10=3
// 12345/1000=12%10=2
// 12345/10000=1%10=1(pow<num)
// 12345/100000=stop the lopp(pow>num)

import java.util.Scanner;
class prac5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long num=sc.nextLong();
    long pow=1;
    while(pow<num){
      int dig=(int)(num/pow)%10;
      System.out.print(dig+" ");
      pow*=10;
    }
    
}
}