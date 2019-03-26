import java.util.Scanner;

public class AlphabetInput
{       // ENTER THE ALPHABETS BETWEEN A - F TO PRINT THE CITY NAME
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter alphabet between A to F to print the city name : ");
        String alphabet = scanner.nextLine();

        // .equalsIgnoreCase can be used with the String values.
        // IGNORE CASE METHOD USED TO USE BOTH LOWERCASE AND LOWERCASE ALPHABETS
        if(alphabet.equalsIgnoreCase("A"))
     {
         System.out.println("Ahmedabad");
     }
        else if (alphabet.equalsIgnoreCase("B"))
     {
         System.out.println("Bombay");
     }
        else if (alphabet.equalsIgnoreCase("C"))
     {
        System.out.println("Chennai");
     }
        else if (alphabet.equalsIgnoreCase("D"))
    {
        System.out.println("Dadar");
    }
        else if (alphabet.equalsIgnoreCase("E"))
    {
        System.out.println("Eifel");
    }
        else if (alphabet.equalsIgnoreCase("F"))
    {
            System.out.println("Faridabad");
    }    else
         {
             System.out.println("Invalid Entry");
         }
     }


    }