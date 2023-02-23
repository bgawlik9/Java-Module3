import java.util.Scanner;

public class LeapYear {
    static boolean isYearLeap  (int giveMeYear){

        return ((giveMeYear % 4 == 0) && (giveMeYear % 100 != 0)) || (giveMeYear % 400 == 0);
    }

    public static void main(String[] args) {

        System.out.println("Give me year to check");
        Scanner scanner = new Scanner(System.in);
        int year =  scanner.nextInt();
        scanner.close();

        if (isYearLeap(year)) {
            System.out.println("Year is leap");
        }
        else {
            System.out.println("Year is not leap");

        }




    }



    }

