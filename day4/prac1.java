// given a date,find the number of days upto that date in the year

//by looping
import java.util.Scanner;
class prac1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eter the date,month,year:");
        int date=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();        
        int[] daysinmonths={31,28,30,31,30,31,30,31,30,31,30,31};
        
        if(year%4==0 && year%100!=0 || year%400==0 ){
        daysinmonths[1]=29;
        }
        
        int totaldays=0;
        for(int i=0;i<month-1;i++){
            totaldays+=daysinmonths[i];
        }
        totaldays+=date;
        System.out.println("The total no fo days:"+totaldays);
    }
}

//by using switch cases
// for (int i = 1; i < month; i++) {
//     switch (i) {
//         case 1: totalDays += 31; break;
//         case 2:
//             // Leap year check using ternary operator
//             totalDays += ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
//             break;
//         case 3: totalDays += 31; break;
//         case 4: totalDays += 30; break;
//         case 5: totalDays += 31; break;
//         case 6: totalDays += 30; break;
//         case 7: totalDays += 31; break;
//         case 8: totalDays += 31; break;
//         case 9: totalDays += 30; break;
//         case 10: totalDays += 31; break;
//         case 11: totalDays += 30; break;
//         case 12: totalDays += 31; break;
//         default: 
//             System.out.println("Invalid month!"); 
//             return;
//     }
// }