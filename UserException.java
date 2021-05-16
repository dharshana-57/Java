public class UserException {
    public static void main(String[] args) {
        int i, j;
        i = 8;
        j = 9;

        try 
        {
            int k = i / j;
            if (k == 0) 
            {
                // throw new Exception(); => call exception
            }
            System.out.println(k);
        } 
        catch (Exception e) 
        {
            System.out.println("error");
        }
    }
}


// continued on eclipse - miraculousgod 