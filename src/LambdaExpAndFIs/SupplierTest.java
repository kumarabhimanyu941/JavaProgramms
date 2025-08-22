package LambdaExpAndFIs;

import java.util.function.Supplier;

public class SupplierTest {

	// only supplies,does not accept anything
	public static void main(String[] args) {

		Supplier<String> supplier = () -> "Abhimanyu";
		System.out.println(supplier.get());
	}
}
