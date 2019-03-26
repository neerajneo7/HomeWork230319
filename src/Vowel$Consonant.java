import java.util.Scanner;

public class Vowel$Consonant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet to find out if it is Vowel or Consonant :");
        String char1 = sc.next();


        if (char1.equalsIgnoreCase("A") || char1.equalsIgnoreCase("E") || char1.equalsIgnoreCase("I")
            || char1.equalsIgnoreCase("O")|| char1.equalsIgnoreCase("U"))
        {   // ignorecase is used to ignore the alphabets entered in upper or lower case
            System.out.println("Your alphabet is a Vowel");
        }else
            {
                System.out.println("Your alphabet is a Consonant");
            }

    }

    }

