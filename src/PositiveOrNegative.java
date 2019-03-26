import java.util.Scanner;

public class PositiveOrNegative
{   // User should be able to find out the value in +, - or 0
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number below to find out if its positive, negative or zero : ");
        double pnz = scanner.nextDouble();

        if(pnz < 0) {
            System.out.println("Your number " + pnz + " is a negative number.");

        }   else if (pnz > 0){
                System.out.println("Your number " + pnz +  " is a positive number.");
                       }
        else{
            System.out.println("Your number " + pnz +  " is Zero.");
                     }

        }


    }


