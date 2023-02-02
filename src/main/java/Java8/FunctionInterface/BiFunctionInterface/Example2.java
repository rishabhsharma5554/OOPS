package Java8.FunctionInterface.BiFunctionInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student {
	String name;
	int rollno;

	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString()
	{
		return String.format("%d,%s",rollno,name);
	}
}

public class Example2 {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		BiFunction<String, Integer, Student> f = (name,rollno) -> new Student(name,rollno);
		al.add(f.apply("Rishabh", 1));
		al.add(f.apply("Rahul", 2));
		al.add(f.apply("Shiva", 3));
		for(Student s:al)
			System.out.println(s);

	}

}
