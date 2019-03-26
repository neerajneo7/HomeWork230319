import java.util.Scanner;

public class PassnFail
{       // If any given subject is below 35, Student should FAIL

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Student : ");
        String name = scanner.next();

        System.out.println("Enter their Roll No : ");
        String rollno = scanner.next();

        System.out.println("Enter the Marks of the following subjects : ");
        System.out.println("Maths : ");
        int maths = scanner.nextInt();

        System.out.println("English : ");
        int english = scanner.nextInt();

        System.out.println("Science : ");
        int science = scanner.nextInt();

        double addition = (maths + english + science);
        System.out.println("Total Marks for all the subjects are : " + addition);

        double percentage = (maths + english + science) * 100 / 300;
        System.out.println("Overall Percentage is : " + percentage + "%");

        if(maths <= 35 || english <= 35 || science <= 35 ) {
            System.out.println("FAIL");
        }else{
            System.out.println("PASS");
        }
    }

}
