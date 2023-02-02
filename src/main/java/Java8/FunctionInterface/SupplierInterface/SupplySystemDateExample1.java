package Java8.FunctionInterface.SupplierInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplySystemDateExample1 {

	public static void main(String[] args) {
		Supplier<Date> s = ()->new Date();
		System.out.println(s.get());
	}
}
