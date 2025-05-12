import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
      int n=6;
      int n2=10;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
          if(i==n || j==n || i==1 || j==1 ||i==j || i+j==n+1){
            System.out.print("* ");
          }
          else{
            System.out.print("  ");
          }
          
        }
        System.out.println();
      }
  }
}