// Encapsulation => Binding Data with Methods 
class StudentDetails
{
    private int rollno;
    private String name;

    // Getters and Setters

    /**
     * @return the rollno
     */
    public int getRollno() {
        System.out.println("Rollno returned");
        return rollno;
    }

    /**
     * @param rollno the rollno to set
     */
    public void setRollno(int rollno) {
        this.rollno = rollno;
        System.out.println("Rollno changed"); // log files
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}


public class encapsulationDemo 
{
    public static void main(String[] args) 
    {
        StudentDetails s1 = new StudentDetails();
        s1.setRollno(5113);
        s1.setName("heera");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());

    }
}
