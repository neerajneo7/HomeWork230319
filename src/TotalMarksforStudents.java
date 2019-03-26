import java.util.Scanner;

public class TotalMarksforStudents
{   // User should be able to find out total percentage and Grades based upon the percentage as per given values

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
        System.out.println("Overall Percentage is : " + percentage);

        if (percentage >= 80) {
            System.out.println("Overall Grade for the given Percentage is : Grade A+");
        } else if (percentage >= 60) {
                System.out.println("Overall Grade for the given Percentage is : Grade A");
            } else if (percentage >= 50) {
                System.out.println("Overall Grade for the given Percentage is : Grade B");
            } else if (percentage >= 35) {
                System.out.println("Overall Grade for the given Percentage is : Grade C");
            } else {
                System.out.println("Fail");
            }

        }
    }





