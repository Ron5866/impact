import java.util.*;

// checking if the digits are devisible by number
// and printing the digits from left to right
public class prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        boolean isValid = true;

        // First, count digits
        int copy = num;
        while (copy != 0) {
            copy /= 10;
            count++;
        }

        // Check each digit from left to right
        int i = count - 1;
        while (i >= 0) {
            int divisor = (int)Math.pow(10, i);
            int digit = num / divisor;
            num %= divisor;

            if (digit == 0 || temp % digit != 0) {
                isValid = false;
                break;
            } else {
                System.out.print(digit + " ");
            }

            i--;
        }

        if (!isValid) {
            System.out.println("-1");
        }
    }
}
