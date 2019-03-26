import java.util.Scanner;

public class EligibilityToVote
{
    public static void main(String[] args)
    {   // User should be able to vote if aged 18 or above with if else method
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age : ");
        int age = scanner.nextInt();

        if(age >= 18)
        {
            System.out.println("Your age is >=18 hence you should be eligible to vote.");
        }else{
            System.out.println("Your age is <=18 hence you should not be eligible to vote.");
        }



    }


}
