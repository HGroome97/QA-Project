import java.util.*;

public class Streams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 0);

		numbers.stream().sorted().forEach(System.out::println);
	}

}
