//NUMBER INTEGGRATION AND DIDINTEGRATION

// 1 2 3 4 5
// M       L

// 12345%10=5
// 12345/10=1234

import java.util.Scanner;

class prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        
        long n = sc.nextLong(); // Use () to call nextLong method

        while (n != 0) {
            int r = (int)(n % 10);
            System.out.print(r+" ");
            n /= 10;
        }

        sc.close(); // Good practice to close the scanner
    }
}

