package Java8.FunctionInterface.ConsumerInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}
public class StudentExample {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		populate(students);
		
		Predicate<Student> p = stu -> stu.marks>=60;
		Function<Student, String> f = stu -> {
			int marks = stu.marks;
			if(marks>=80)
				return "A";
			else if(marks>=60)
				return "B";
			else if(marks>=50)
				return "C";
			else if(marks>=35)
				return "D";
			else 
				return "F";
		};
		
		Consumer<Student> c = stu -> {
			System.out.println(stu.marks+" "+stu.name+" "+f.apply(stu));
		};
		
		for(Student stu : students)
			if(p.test(stu))
				c.accept(stu);
		
/*
 * 100 Sunny A
 * 65 Bunny B
*/
	}

	private static void populate(ArrayList<Student> students) {
		students.add(new Student("Sunny",100)); 
		students.add(new Student("Bunny",65)); 
		students.add(new Student("Chinny",55)); 
		students.add(new Student("Vinny",45)); 
		students.add(new Student("Pinny",25));
	}

}
