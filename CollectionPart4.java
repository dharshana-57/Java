package miraculousgod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Collections and Generics => Comparable Interface
// Own class we need sort operations means use this interface

class Student implements Comparable<Student>
{
	String name;
	int rollNo, marks;
	
	public Student(int rollNo, String name, int marks) 
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	public int  compareTo(Student s)
	{
		return name.length()>s.name.length()? 1:-1;
	}
}
public class CollectionPart4 {

	public static void main(String[] args) {
		
		List<Student> stud= new ArrayList<>();
		stud.add(new Student(123, "Ria", 489) );
		stud.add(new Student(124, "Tinny", 469) );
		stud.add(new Student(125, "Wora", 409) );
		stud.add(new Student(126, "Desaye", 439) );
		
//		Collections.sort(stud);
//		overrides comparable interface with comparator interface
		Collections.sort(stud, (i, j) -> i.marks>j.marks? 1 : -1 );
		
		for (Student sInfo : stud) 
		{
			System.out.println(sInfo);
		}
	}

}
