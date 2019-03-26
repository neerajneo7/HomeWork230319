import java.util.Scanner;

public class TurneryOperator
{   // Turnery Operator used to find out if the number is even or odd
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number as : ");
        int a = scanner.nextInt();
        String evenOdd = (a % 2 == 0) ? "even" : "odd"; // here the method is divided by 2
        System.out.println(a + " is " + evenOdd);

        System.out.println("Enter the number as : ");
        int b = scanner.nextInt();
        String oddEven = (a % 2 == 0) ? "even" : "odd";
        System.out.println(b + " is " + oddEven);

    }

}

