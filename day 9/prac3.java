import java.util.*;

public class prac3 {
  
  public static int[] summation(int arr[]){
    int sum=0;
    int j=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    for(int k=0;k<arr.length;k++){
      arr[j]=sum-arr[k];
      j++;
    }
    return arr;
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int noe=sc.nextInt();
    int arr[]=new int[noe];
    for(int i=0;i<noe;i++){
      arr[i]=sc.nextInt();
    }
    summation(arr);
    for(int i : arr){
      System.out.print(i+" ");
    }
    
  }
  
}
