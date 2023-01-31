package Java8NewFunctionalInterfaces.FunctionInterface.StudentGrades;

import java.util.ArrayList;
import java.util.function.Function;

public class Grading {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		populate(students);
		Function<Student,String> f = s -> {
			int marks = s.marks;
			if(marks>=80)
				return "A";
			if(marks>=60)
				return "B";
			if(marks>=50)
				return "C";
			if(marks>=35)
				return "35";
			else
				return "F";			
		};
		
		for(Student stu : students)
			System.out.println(stu+" "+f.apply(stu));
	}

	private static void populate(ArrayList<Student> al) {
		al.add(new Student("Sunny", 100));
		al.add(new Student("Bunny", 65));
		al.add(new Student("Chinny", 55));
		al.add(new Student("Vinny", 45));
		al.add(new Student("PInny", 25));
	}
}
