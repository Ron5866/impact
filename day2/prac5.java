import java.util.*;
class prac5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int c=sc.nextInt();
        System.out.printf("+%d",c);
        // *+ is used to add the number in the string and not to add the number in the string
        // "\" is used to escape the string and not to add the number in the string

        System.out.println("Sucess is when \"signature\" is not required");

        //swapping of two numbers without using third variable
        System.out.println("Enter the number:");
        int b=sc.nextInt();
        c=c+b;
        b=c-b;
        c=c-b;
        System.out.println("The swapped number of c: "+c);
        System.out.println("The swapped number of b: "+b);

        
    }
}