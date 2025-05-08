package day3;

public class prac1 {
    public static void main(String[] args){
        int day=3;
        switch (day) {
            case 1:
                System.out.println("MOnday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                 System.out.println("Wednesday");
                 break;
            case 4:
                System.out.println("Thrusday");
            //not necessary to use break statement in the last case    
            default:
                System.out.println("Invalid day");

        }
    }
}

//instead of using a break statement 
// we cannot mention the condition in this way->
//we can use->

// switch(op){
//     case op1 ->statement;
//     case op2 ->statement;
// }