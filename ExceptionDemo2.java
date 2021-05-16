// CHECKED EXCEPTION | FINALLY BLOCK

/*
 * compiler knows about it -> checked exception
 * compiler don't know about it means then it is unchecked exception
 * io.* => resources
 * if u got exception resource won't close
 * close the resource in finally block
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionDemo2 {
    public static void main(String[] args) throws Exception
    {
        int n = 0;
        System.out.print("Enter a number:");
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
            // br.close(); // close the resources
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            br.close(); // close the resources
        }
        System.out.println(n);
    }
}
