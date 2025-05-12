import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
      int n=5;
      int n2=3;
      
      for(int i=1;i<=n;i++){
        for(int spaces=1;spaces<=n-i;spaces++){
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j);
          }
          for(int j=i-1;j>=1;j--){
            System.out.print(j);
          }
          System.out.println();
        } 
      }
      
  }