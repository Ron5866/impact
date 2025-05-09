import java.util.*;

// converting decimal to octal
public class prac3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        long num = sc.nextLong();
        long binary=0,place=0;
        while(num>=1){
          int rem=(int)(num%8);
          binary=binary+(int)Math.pow(10,place)*rem;
          place++;
          num=num/8;
        }
        System.out.println(binary);
        
    }
}

