import java.util.*;

public class prac1 {
  
    public static int Search_element(int arr[], int n){
      for(int i=0;i<arr.length;i++){
        if(arr[i]==n){
          return 1;
        }
      }
      return 0;
    } 
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no of elments");
      int noe=sc.nextInt();
      int arr[]=new int[noe];
      for(int i=0;i<noe;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("Ente the number to be found");
      int n=sc.nextInt();
      
      System.out.println(Search_element(arr, n));
  }
}
