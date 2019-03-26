import java.util.Scanner;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

public class InterchangedValue
{
        // the figures should swap for the below values when the print command is given
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("Before Swap");
        System.out.println("a value : " +a);
        System.out.println("b value : " +b);

        a = a + b;
        // System.out.println(a) now a is (10+20)=30
        b = a - b;
        // System.out.println(b) now b is (30-20) = 10
        a = a - b;
        // System.out.println(a); now a is (30-10) = 20

        System.out.println("After Swap"); // this should swap the values of a&b now
        System.out.println("a value : " +a);
        System.out.println("b value : " +b);



    }


}
