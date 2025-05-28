import java.util.*;

public class prac1 {
    public static void main(String[] args) {
      System.out.println("PRINITING THE FACTORS IN PAIR:");
      Scanner sc=new Scanner (System.in);
      int num=sc.nextInt();
      for(int itr=1;itr<Math.sqrt(num);itr++){
        if(num%itr==0){
          int q=num/itr;
          System.out.println(q+"*"+itr);
        }
      }
  }
}