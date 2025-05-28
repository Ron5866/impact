import java.util.Scanner;

public class arr2 {
    public static void count(int arr[]){
    int zc=0;
    int oc=0;
    if(arr.length==0){
        System.out.println("Array is empty");
    }
    else{
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                zc++;
            }
            else{
                oc++;
            }
        }
        System.out.println("Number of 0's: "+zc);
        System.out.println("Number of 1's: "+oc);
    }

}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int noe=sc.nextInt();
        int arr[]=new int[noe]; // declaration and instantiation
        for(int i=0;i<noe;i++){
            arr[i]=sc.nextInt();
        }
        count(arr);
    }
    
}
