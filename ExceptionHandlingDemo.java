/*
  * EXCEPTION HANDLING :
    + try => critical stmt exception arising code
    + catch => code that handles exception
    + throw
    + throws
    + finally => executed always (Exception/ No Exception )
*/

public class ExceptionHandlingDemo 
{
    public static void main(String[] args) 
    {
        try 
        {
            // int a[] = null;
            // a[4] = 5;
            // int a[] = new int[6];
            // a[6] = 6;
            int i = 7;
            int j = 0;
            int r = i/j ;
            System.out.println("result:" + r);  
        } 

        // catch (ArithmeticException e | ArrayIndexOutOfBoundsException e) => 1.7 and later version

        catch (ArithmeticException e) 
        {
            System.out.println("error can't divide by 0!");
            // System.err.println("error!"); => it will print in red color
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("error array index limit out!");
        }

        catch(Exception exception) // catches all exception so write at last
        {
            System.out.println("Program Abrupt!");
        }
        finally
        {
            System.out.println("Bye...");
        }
        
    }
}
