package LambdaExpAndFIs;

public class RunnableInterface {

	public static void main(String[] args) {

		Runnable run = () -> {

			for (int i = 1; i <= 10; i++) {
				System.out.println("Hello" + i);
			}

		};

		Thread thread = new Thread(run);
		thread.run();
	}

}
