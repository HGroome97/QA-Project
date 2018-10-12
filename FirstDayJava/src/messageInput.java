import java.util.function.*;

public interface messageInput extends Consumer<String> {

	default void accept(String t) {
		System.out.println("Hello " + t);
	}

}