import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
      int n=5;
      int n2=10;
      for(int i=0;i<=n;i++){
        for(int j=0;j<=n2;j++){
          if(i+j<=n){
            System.out.print("*");
          }
          else if(j-i>=n){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
  }
}