import java.util.function.Consumer;

//import java.util.function;

public class Runner {

	public static void main(String[] args) {
		HelloWorldMessage();
	}

	public static void HelloWorld() {
		System.out.println("Hello World");
	}

	public static void HelloWorldMessage() {

		messageInput messTest = new messageInput() {};
		messTest.accept("Interface");

		Consumer<String> messageInput = (s -> System.out.println("Hello " + s));
		messageInput.accept("Self-defined");

	}

}
