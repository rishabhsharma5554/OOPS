package Java8.FunctionInterface.Function.StudentGrades;

public class Student {
	String name;
	Integer marks;
	Student(String name,Integer marks)
	{
		this.name=name;
		this.marks = marks;
	}
	public String toString()
	{
		return String.format("%s %d",name, marks);
	}
}
