import java.util.Scanner;

public class SalesCommission
{   // User should be able to find out sales commission upon entering the given values
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Sales Id :" );
        String sales_id = scanner.next();

        System.out.println("Enter Sellers Name : ");
        String name = scanner.next();

        System.out.println("Enter Sales Amount : ");
        float sales = scanner.nextInt(); // float used incase the figures are in decimal or fraction

        System.out.println("Enter Basic Salary : ");
        float salary = scanner.nextInt();

        System.out.println("Please see below for Sales Commission : ");

        if(sales >=50000) // if the given value to sales is more than or equal to 50000 the the commission should be 35%
        {
            System.out.println("Commission is : " + sales * 35 / 100);
        }
            else if(sales >=30000)
            {
            System.out.println("Commission is : " + sales*20/100);
            }else if (sales >=20000)
        {
            System.out.println("Commission is : " + sales*10/100);
        }   else if(sales >=10000)
        {
            System.out.println("Commission is : " + sales*5/100);
        }   else if(sales < 10000)
        {
            System.out.println("Commission is : " + sales*2/100);
        }else {
            System.out.println("No Commission");
        }


    }

}
