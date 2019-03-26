import java.util.Scanner;

public class AirthmeticMethods
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        float a = sc.nextFloat();

        System.out.println("Enter the value of b : ");
        float b = sc.nextFloat();

        // INSERT THE BELOW SYMBOLS TO GET THE ACTUAL ANS FOR GIVEN VALUES
        System.out.println("Enter your symbol as (+) or (-) or (/) or (*) : " );
        String symbol = sc.next();

        if(symbol.equals("+")) // THIS SHOULD ADD THE VALUES
        {
            System.out.println("The value of " +a+ " + " +b+ " = " + (a+b));
        }else if (symbol.equals("-")) // THIS SHOULD SUBSTRACT THE VALUES
        {
            System.out.println("The value of " +a+ " - " +b+ " = " + (a-b));
        }else if (symbol.equals("/")) // THIS SHOULD DIVIDE THE VALUES
        {
            System.out.println("The value of " +a+ " / " +b+ " = " + (a/b));
        }else if (symbol.equals("*")) // THIS SHOULD MULTIPLY THE VALUES
        {
            System.out.println("The value of " +a+ " * " +b+ " = " + (a*b));
        }
        else
        {
            System.out.println("Invalid Data");
        }
    }
}
