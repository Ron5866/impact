import java.util.*;

public class prac4 {
  
  public static int[] swapping(int arr[]){
    int rear=arr.length-1;
    for(int front=0;front<rear;front++){
      int temp=arr[front];
      arr[front]=arr[rear];
      arr[rear]=temp;
      rear--;
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
    swapping(arr);
    for(int i : arr){
      System.out.print(i+" ");
    }
    
  }
  
}
