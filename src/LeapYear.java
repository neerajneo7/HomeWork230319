import java.util.Scanner;

public class LeapYear
{   // User should be able to find out the leap year upon entering the year
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter any year to find if it is a leap year : ");
        int year = scanner.nextInt();

        if(year % 4 == 0) // given year is divided by 4
        {
            System.out.println( year + " is a leap year");
        }else{
            System.out.println(year + " is the not the leap year");
        }



    }



}
