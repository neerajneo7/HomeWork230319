import java.util.Scanner;

public class PrintDayOfTheWeek
{   // print the days by entering the numbers between 1 to 7
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7 to find out the Day of the Week : ");
        String number = sc.next();

        if(number.equals("1"))
        {
            System.out.println("The Day is Monday.");
        }else if(number.equals("2"))
            {
                System.out.println("The Day is Tuesday");
            }
            else if (number.equals("3"))
        {
            System.out.println("The Day is Wednesday");
        }
            else if(number.equals("4"))
        {
            System.out.println("The Day is Thursday");
        }
            else if(number.equals("5"))
        {
            System.out.println("The Day is Friday");
        }
            else if(number.equals("6"))
        {
            System.out.println("The Day is Saturday");
        }
            else if(number.equals("7"))
        {
            System.out.println("The Day is Sunday");
        }
            else
            {
                System.out.println("Invalid Entry");
            }
    }
}
