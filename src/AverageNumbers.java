import java.util.Scanner;

public class AverageNumbers // enter the values to get the average for the given numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for five numbers as below : ");
        double a = scanner.nextDouble(); // input the value for a
        double b = scanner.nextDouble(); // input the value for b
        double c = scanner.nextDouble(); // input the value for c
        double d = scanner.nextDouble(); // input the value for d
        double e = scanner.nextDouble(); // input the value for e
        double addition = a+b+c+d+e;
        double average = addition / 5; // this should average the total values
        System.out.println("Total = " + addition);
        System.out.println("Average = " + average);

    }

}
