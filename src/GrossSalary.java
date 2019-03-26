import org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS;

import java.util.Scanner;

public class GrossSalary //find the gross salary by giving the following info
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Id : " );
        String name = scanner.next();

        System.out.println("Employee's First Name : " );
        String employeef = scanner.next();

        System.out.println("Employee's  Last Name : " );
        String employeel = scanner.next();

        System.out.println(employeef + "'s" +  " Basic Salary : " );
        double salary = scanner.nextInt();

        double HRA = (salary * 10/100); //HRA is based on 10 percent commission
        System.out.println("HRA : " + HRA);

        double DA = (salary * 8/100); // DA is based on 8 percent commission
        System.out.println("DA  : " + DA);

        double TA = (salary * 9/100); // TA is based on 9 percent commission
        System.out.println("TA  : " + TA);;


        double PF = (salary * 20/100); //PF is based on 20 percent commission
        System.out.println("PF  : "  + PF);

        double GrossSalary = (salary + HRA + DA + TA - PF); // Gross salary calculation
        System.out.println("Gross Salary for " + employeef + " " + employeel +  " is : " + GrossSalary);
    }



}
