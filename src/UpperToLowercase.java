import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class UpperToLowercase
{       // toLowerCase syntax used to change the UpperCase to LowerCase
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any alphabet in Upper Case : ");
        String alphabet = scanner.next();

        System.out.println("Lower Case : " + alphabet.toLowerCase());
        System.out.println("Upper Case : " + alphabet.toUpperCase());

    }

}
