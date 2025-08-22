package LambdaExpAndFIs;

import java.util.function.Consumer;

public class ConsumerTest {

	// A consumer only takes and input and does not return anything
	public static void main(String[] args) {

		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("Abhimanyu");
	}
}
