// IMP METHODS OF SCANNER CLASS:

// String next()-take and returns a strings
// String nextLine()-take and return a line of String
// nextInt()-take and return a integer
// nextDouble()-take and return a double
// nextBoolean()-take and return a boolean
// nextByte()-take and return a byte


// whilen using different build in methos we need to know the 
//"return type of the method,
//name and purpose of the method"


//progm to accept a program a number and float and a line of stirng and display line of string 
import java.util.Scanner;
public class prac2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int c=sc.nextInt();
        System.out.println("Enter the string:");
        String b=sc.next();
        System.out.println(c);
        System.out.println(sc);
    }
    
}
