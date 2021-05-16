// TRY WITH RESOURCE = SYNTAX
// we can write try block without catch or finally block

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionDemo3 {
    public static void main(String[] args) throws Exception
    {
        int n = 0;
        System.out.print("Enter a number:");

        // BufferedReader br = null;

        // if we put like this means resource will be closed automatically even it throws exception

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            n = Integer.parseInt(br.readLine());
            // br.close(); // close the resources
        }
        // finally
        // {
        //     br.close(); // close the resources
        //     System.out.println("closed!");
        // }
        System.out.println(n);
    }
}
