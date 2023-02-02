package Java8.MethodReferenceOperator;
class Sample{
	Sample()
	{
		System.out.println("Sample class constructor invoked.");
	}
}

interface Interfe
{
	public Sample get();
}


public class ConstructorReference {

	public static void main(String[] args) {
//		with lambda Expression
		Interfe i = () -> new Sample();
		i.get();
	
//		with constructor Referece
		Interfe i2 = Sample::new;
		i2.get();
	}

}
