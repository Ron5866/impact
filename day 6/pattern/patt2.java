import java.util.*;

public class patt2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
          for(int j=1;j<=num;j++){
            if(i+j>=num){
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
        
    
