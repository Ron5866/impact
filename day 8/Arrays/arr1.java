//arrays is used to store multiple values in a single variable, instead of declaring separate variables for each value.
// base add+ index*size(datatype)

/*
 * syntax:
 * datatype [] arrayName = new datatype[size];
 */

// array is a collection of similar data types


import java.util.Scanner;

public class arr1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int doe=sc.nextInt();
        int [] arr=new int[doe]; // declaration and instantiation
        for(int i=0;i<doe;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("printing the array: ");
        for(int i=0;i<doe;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
