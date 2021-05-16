/**
 * Student
 */
class Student 
{
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    Student s4 = new Student();

    Student s[] = {s1, s2 , s3, s4}; // array of objects
    
}

public class arrayDemo {
    public static void main(String[] args) {
        int nums[] = new int[4]; // 1D array
        int num1[] = { 4, 8, 9 , 0 };
        nums[0] = 7;
        nums[1] = 79;
        nums[2] = 89;
        nums[3] = 70;
        // for (int i = 0; i < 4; i++) {
        //     System.out.println(num1[i]);
        // }

        int a[] = {1, 2, 3, 4};
        int b[] = {11, 12, 13, 14};
        int c[] = {21, 22, 23, 24};
        int d[][] = {  // 2D array
            {10, 20, 30, 40},
            {11, 12, 13, 14},
            {21, 22, 23, 24}
        };

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                System.out.print(" " + d[i][j]);
            }
            System.out.println();
        }

        int e[][] ={ // Jagged array -> no. of columns not fixed
            {1, 2, 3},
            {30, 6, 79, 9},
            {1, 2}
        };
        
        for (int k[] : e) // enhanced for loop
        { 
            for (int l : k) 
            {
                System.out.println(l);
            }
        }

        for (int i = 0; i < e.length; i++)
        {
            for (int j = 0; j < e[i].length; j++) 
            {
                System.out.print(" " + e[i][j]);
            }
            System.out.println();
        }
       
        int f[] = {2, 7, 9, 8};

        for (int i : f) {
            System.out.println(i);
        }
    }
}
