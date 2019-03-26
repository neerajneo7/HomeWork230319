import java.util.Scanner;

public class Number_Alphabet_Symbol
{       // upon entering the given values user should find out if it is digit,alphabet or a symbol
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to find out its origin : ");
        char char10 = sc.next().charAt(0); // char used. chartAt(0) is a part of the method
        if ((char10 >= 48 && char10 <= 57) || char10 == 45) //ASCII RANGE USED
        {
            System.out.print(char10 + " is a Digit");
        } else if ((char10 >= 'a' && char10 <= 'z') || (char10 >= 'A' && char10 <= 'Z'))
        // this should run both Lowercase and Uppercase
        {
            System.out.print(char10 + " is an Alphabet");
        } else {
            System.out.print(char10 + " is a Symbol");

        }
    }

}
